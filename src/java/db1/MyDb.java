package db1;


import DTO.Match;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author umesh
 */
public class MyDb {

    private static Connection connection = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/hackerjacks", "umesh", "umesh");
            System.out.println("Connection");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean insertMatchEntry(Match match) {
        String query = "insert into game_table (team_one,team_two,no_of_players,overs) values (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            st.setString(1, match.getTeam_one_name());
            st.setString(2, match.getTeam_two_name());
            st.setInt(3, match.getPlayers());
            st.setInt(4, match.getOvers());
            
            if(st.executeUpdate()>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
