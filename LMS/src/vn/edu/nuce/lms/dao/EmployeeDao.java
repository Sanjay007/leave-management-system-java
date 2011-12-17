/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.lms.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    Statement st;
       DefaultTableModel model;
    Connection conn;
   // Statement st;
    PreparedStatement pstmt;
    ResultSet rs;
        BaseDao connect = new BaseDao();
    public List<Employee> getListEmployee() {
        List<Employee> listEmployee = new ArrayList<Employee>();
        Employee employee;
        
        // Create connection
        Connection connection = null;
        PreparedStatement getEmployeeListStm = null;
        ResultSet resultSet = null;
        
        //  lay gia tri trong database va gan vao danh sanh ListEmployee
        
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
            // neu co loi xay ra thi co the backup lai du lieu
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                throw new RuntimeException(e1);
            }
            e.printStackTrace();
            throw new RuntimeException(e);
            //dong connection
        } finally {
           // cleanupDatabaseResources(connection, getEmployeeListStm, resultSet);
        }
        
        return listEmployee;
    }
     public void Load(JTable tblManagerEmployee) {

       model = (DefaultTableModel) tblManagerEmployee.getModel();
        //Xóa dữ liệu trong data Vector object
        model.getDataVector().removeAllElements();
        //Cập nhật lại jTable để hiển thị trên màn hình
       tblManagerEmployee.repaint();
        try {

            conn = connect.getConnection();

            st = conn.createStatement();
            String strsql = "SELECT EmId,EmName,EmDayOfBirth,EmLevel,EmEmail,EmPhone,EmJoinDay,EmDayOfLeave from Employee";
            rs = st.executeQuery(strsql);

            try {
                //Vector v = null;
                while (rs.next()) {
                     Vector v = new Vector();
                    v.addElement(rs.getInt(1));
                    v.addElement(rs.getString(2));
                    v.addElement(rs.getDate(3));
                    v.addElement(rs.getInt(4));
                    v.addElement(rs.getString(5));
                    v.addElement(rs.getString(6));
                    v.addElement(rs.getDate(7));
                    v.addElement(rs.getInt(8));
            
                    model.addRow(v);
                }
                //set lai model cho jtable
                tblManagerEmployee.setModel(model);
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
