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
    protected Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=nhansu", "sa","");
        connection.setAutoCommit(false);
        return connection;
    }

    /**
     * Clean up database resources
     * @param connection connection to close
     * @param statement statement to close
     * @param resultSet resultSet to close
     */
    protected void cleanupDatabaseResources(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
