package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.data.TeamDataService;
import com.virtualpairprogrammers.domain.Jugador;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/addPlayer")
public class AddPlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String teamName = (String)session.getAttribute("teamName");
        String resultPage;
        if(teamName ==null){
            resultPage = "index.jsp";
        }
        else{
            resultPage = "newPlayer.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
        dispatcher.forward(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int number = Integer.parseInt(request.getParameter("number"));
        String position = request.getParameter("position");
        int age = Integer.parseInt(request.getParameter("age"));
        TeamDataService teamDataService = new TeamDataService();
        System.out.println(teamDataService.getPlayers());
        if(name!=null && !name.equals("")){
            teamDataService.addPlayer(new Jugador(name,number,position,age));
        }
        System.out.println(teamDataService.getPlayers());
        request.getSession().setAttribute("jugadores", teamDataService.getPlayers());
        String resultPage = "/seePlayers";
        RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
        dispatcher.forward(request,response);

    }
}
