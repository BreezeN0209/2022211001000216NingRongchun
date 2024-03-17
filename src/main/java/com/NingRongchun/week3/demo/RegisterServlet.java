package com.NingRongchun.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/week2/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthdate = request.getParameter("birthdate");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<p><strong>Username:</strong> " + username + "</p>");
        writer.println("<p><strong>Password:</strong> " + password + "</p>");
        writer.println("<p><strong>Email:</strong> " + email + "</p>");
        writer.println("<p><strong>Gender:</strong> " + gender + "</p>");
        writer.println("<p><strong>Birthdate:</strong> " + birthdate + "</p>");
        writer.println("</body></html>");

        writer.close();
    }
}