package iuh.fit.se.ltwww_java_29082025_tuan02_hoviet;


import iuh.fit.se.ltwww_java_29082025_tuan02_hoviet.db.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;
import java.sql.*;

@WebServlet("/uploadData")
@MultipartConfig

public class Bai03 extends HttpServlet {
    private String uploadPath;

    @Override
    public void init() {
        uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
        File dir = new File(uploadPath);
        if (!dir.exists()) dir.mkdir();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        Part filePart = req.getPart("photo");

        String fileName = filePart.getSubmittedFileName();
        InputStream inputStream = filePart.getInputStream();
        String message;

        try (Connection conn = DBConnection.getConnection()) {
            // Insert dữ liệu
            String sql = "INSERT INTO contacts(first_name, last_name, photo) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setBlob(3, inputStream);
            stmt.executeUpdate();

            // Lấy lại ảnh từ DB và ghi ra file
            ResultSet rs = stmt.getGeneratedKeys();
            int id = -1;
            if (rs.next()) id = rs.getInt(1);

            String sqlSelect = "SELECT photo FROM contacts WHERE contact_id=?";
            PreparedStatement ps = conn.prepareStatement(sqlSelect);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                InputStream blobStream = result.getBinaryStream("photo");
                FileOutputStream fos = new FileOutputStream(uploadPath + File.separator + fileName);

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = blobStream.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                fos.close();
                blobStream.close();
            }

            message = "Upload and save into DB success!";
        } catch (SQLException e) {
            e.printStackTrace();
            message = "ERROR: " + e.getMessage();
        }

        resp.getWriter().println(message);
    }
}
