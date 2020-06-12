/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DTO.Match;

/**
 *
 * @author umesh
 */
public class GameTable {
    
    
        public static boolean matchEntry(Match match){
            
            String team1 = match.getTeam_one_name().trim();
            String team2 = match.getTeam_two_name().trim();
            int overs = match.getOvers();
            int players = match.getPlayers();
            
         
            if(team1 != null || team2 != null){
                return db1.MyDb.insertMatchEntry(match);
            }
            return false;
        }
    
}
