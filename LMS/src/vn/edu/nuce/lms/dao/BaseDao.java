/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TRAN VIE CUONG
 */
public class BaseDao {

    /**
     * Get a connection to the data store
     * @return database connection
     * @throws SQLException if an error occurs getting a connection
     */

    static String conStr = "jdbc:sqlserver://localhost;databaseName=MLS";
    static String userName = "sa";
    static String passWord = "76478124";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(conStr, userName, passWord);   
            System.out.println("Connect Successfull!");
        } 
        catch (ClassNotFoundException ex) 
        {
        } 
        catch (SQLException ex) 
        {
        }
        return conn;
    }
    }

    /**
     * Clean up database resources
     * @param connection connection to close
     * @param statement statement to close
     * @param resultSet resultSet to close
     */
//    protected void cleanupDatabaseResources(Connection connection, Statement statement, ResultSet resultSet) {
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//            if (statement != null) {
//                statement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
