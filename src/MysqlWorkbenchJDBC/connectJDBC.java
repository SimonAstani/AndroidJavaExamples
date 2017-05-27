/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysqlWorkbenchJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class connectJDBC {
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","simon");
            if(conn != null){
            System.out.println("connected to database");
        }    
        } catch (SQLException ex) {
            System.out.println("not connected to dadtabase");
            Logger.getLogger(connectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
