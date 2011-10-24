/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vn.edu.nuce.lms.model.Employee;

/**
 *
 * @author TRAN VIE CUONG
 */
public class EmployeeDao extends BaseDao {
    /**
     * Get list employees
     * @return List Employee
     */
    public List<Employee> getListEmployee() {
        List<Employee> listEmployee = new ArrayList<Employee>();
        Employee employee;
        
        // Create connection
        Connection connection = null;
        PreparedStatement getEmployeeListStm = null;
        ResultSet resultSet = null;
        
        try {
            connection = getConnection();
            getEmployeeListStm = connection.prepareStatement("SELECT idEmployee, Name FROM employee");
            resultSet = getEmployeeListStm.executeQuery();
            while (resultSet.next()) {
                employee = new Employee();
                employee.setIdEmployee(resultSet.getString("idEmployee"));
                employee.setName(resultSet.getString("Name"));
                listEmployee.add(employee);                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                throw new RuntimeException(e1);
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            cleanupDatabaseResources(connection, getEmployeeListStm, resultSet);
        }
        
        return listEmployee;
    }
    
}
