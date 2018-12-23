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

@WebServlet("/seePlayers")
public class SeePlayersServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Jugador> jugadores = (List<Jugador>)session.getAttribute("jugadores");
        if(jugadores == null || jugadores.size()==0 ){
            jugadores = new TeamDataService().getPlayers();
            session.setAttribute("jugadores",jugadores);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("listPlayers.jsp");
        dispatcher.forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
