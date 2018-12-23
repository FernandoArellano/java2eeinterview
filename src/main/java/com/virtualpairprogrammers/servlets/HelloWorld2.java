package com.virtualpairprogrammers.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloWorld2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        System.out.println("Do get executed: " + name);
        request.getSession().setAttribute("name",name);

        String redirectUrl = "/welcome.jsp";
        redirectUrl = response.encodeURL(redirectUrl);
        response.sendRedirect(redirectUrl);
        System.out.println("aqui no");
    }
}
