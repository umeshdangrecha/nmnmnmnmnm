/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author umesh
 */
public class Match {
    private String team_one_name;
    private String team_two_name;
    private int overs;
    private int players;
    private int match_id;
    private boolean toss;

    public Match() {
    }

    public Match(String team_one_name, String team_two_name,int players,int overs) {
        this.team_one_name = team_one_name;
        this.team_two_name = team_two_name;
        this.overs = overs;
        this.players = players;
    }

    public Match(String team_one_name, String team_two_name, int players, int overs, int match_id, boolean toss) {
        this.team_one_name = team_one_name;
        this.team_two_name = team_two_name;
        this.overs = overs;
        this.players = players;
        this.match_id = match_id;
        this.toss = toss;
    }
    
    
    

    public String getTeam_one_name() {
        return team_one_name;
    }

    public void setTeam_one_name(String team_one_name) {
        this.team_one_name = team_one_name;
    }

    public String getTeam_two_name() {
        return team_two_name;
    }

    public void setTeam_two_name(String team_two_name) {
        this.team_two_name = team_two_name;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public boolean isToss() {
        return toss;
    }

    public void setToss(boolean toss) {
        this.toss = toss;
    }
    
    
    
    
}
