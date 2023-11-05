/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class connect {
     Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pd = null;

    connect() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Administrator\\Desktop\\StudentManagement.accdb");
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
