package com.example.w4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "inputController", urlPatterns = "/") // "/calc/input/a" 패턴
public class InputController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* super.doGet(req, resp);
        super.doGet(req, resp);
        super.doGet(req, resp);*/
        System.out.println("InputController...doGet...");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");

        dispatcher.forward(req, resp);

    }
}
