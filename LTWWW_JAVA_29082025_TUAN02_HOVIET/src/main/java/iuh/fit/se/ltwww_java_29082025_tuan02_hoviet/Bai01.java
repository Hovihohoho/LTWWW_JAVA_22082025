package iuh.fit.se.ltwww_java_29082025_tuan02_hoviet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Bai01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("LoggingFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("Request URL: " + req.getRequestURL());

        String token = req.getParameter("token");
        if (token == null || !token.equals("12345")) {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h3>Access Denied - Missing token</h3>");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("LoggingFilter destroyed");
    }
}
