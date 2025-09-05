package iuh.fit.se.ltwww_java_29082025_tuan02_hoviet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.File;
import java.io.IOException;

@WebServlet("/uploadFile")
@MultipartConfig
public class Bai02 extends HttpServlet {

    private String uploadPath;

    @Override
    public void init() {
        // Đường dẫn lưu file (webapp/uploads)
        uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        for (Part part : request.getParts()) {
            String fileName = part.getSubmittedFileName();
            if (fileName != null && !fileName.isEmpty()) {
                part.write(uploadPath + File.separator + fileName);
            }
        }
        response.getWriter().println("Upload success! Files saved at: " + uploadPath);
    }
}
