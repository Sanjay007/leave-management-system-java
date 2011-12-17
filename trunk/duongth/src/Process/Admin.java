/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Connection.Connect;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author tiger
 */
public class Admin {
    public boolean testLogin(String admin,String pass) throws SQLException
    {
        Connect ketnoi;
        ketnoi = new Connect();
        String procName = "admin_SelectByAll";
        String [] doiso; 
        doiso = new String[2];
        doiso[0]= admin;
        doiso[1] = pass;
        ResultSet rs;
        rs = ketnoi.runProc(procName, doiso);
        
        if (rs.next()) return true;
        else return false;
    }
}
