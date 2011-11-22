/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.business;

import java.util.ArrayList;
import java.util.List;
import vn.edu.nuce.lms.dao.EmployeeDao;
import vn.edu.nuce.lms.model.Employee;

/**
 *
 * @author TRAN VIE CUONG
 */
public class EmployeeManager {
    /**
     * Get list employees
     * @return List Employee
     */
    public List<Employee> getListEmployee() {
        List<Employee> listEmployee =  new ArrayList<Employee>();
        EmployeeDao employeeDao = new EmployeeDao();
        
        listEmployee = employeeDao.getListEmployee();
        
        return listEmployee;
    }
}
