package com.example.w4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "myServlet", urlPatterns = "/myy")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8"); //html의 meta선언과 동일

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>MyServlet</h2>");
        out.println("</body></html>");
        //super.doGet(req, resp);
    }
}

