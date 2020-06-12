/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.Match;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GameTable;

/**
 *
 * @author umesh
 */
@WebServlet(name = "Team_Checker", urlPatterns = {"/Team_Checker"})
public class Team_Checker extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String team1 = req.getParameter("team_one_name");
        String team2 = req.getParameter("team_two_name");
        int overs = Integer.parseInt(req.getParameter("overs"));
        int players = Integer.parseInt(req.getParameter("players"));
        
        Match match = new Match(team1,team2,players,overs);
        boolean  b = GameTable.matchEntry(match);
        
        PrintWriter out = resp.getWriter();
        
        if(b)out.write("success");
        else out.write("failed");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }

    
}
