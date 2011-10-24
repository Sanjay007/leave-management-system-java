/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.ui;

import java.util.ArrayList;
import java.util.List;
import vn.edu.nuce.lms.business.EmployeeManager;
import vn.edu.nuce.lms.model.Employee;

/**
 *
 * @author TRAN VIE CUONG
 */
public class Test {

    public static void main(String[] arg) {

        EmployeeManager employeeManager = new EmployeeManager();

        List<Employee> listEmployee = new ArrayList<Employee>();
        
        listEmployee = employeeManager.getListEmployee();
        
//        for (int i = 0; i < listEmployee.size(); i++) {
//            System.out.println("id:" + listEmployee.get(i).getIdEmployee());
//            System.out.println("Name:" + listEmployee.get(i).getName());
//        }
        
        for (Employee employee : listEmployee) {
            System.out.println("id:" + employee.getIdEmployee());
            System.out.println("Name:" + employee.getName());
        }
    }
}
