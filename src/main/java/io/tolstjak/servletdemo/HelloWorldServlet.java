package io.tolstjak.servletdemo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Step 1: set the content type
        response.setContentType("text/html");

        // Step 2: get the PrintWriter
        PrintWriter out = response.getWriter();

        // Step 3: generate HTML content
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<hr>");
        out.println("Time on the server is: " + new java.util.Date());
        out.println("</body></html>");
    }

    public void destroy() {
    }
}