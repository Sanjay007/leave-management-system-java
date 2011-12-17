package Connection;
import java.sql.*;

public class Connect {
    private Connection con;
    private String database;
    private String user;
    private String pass;
    public Connect() {
        database = "duongth";
        user= "sa";
        pass = "123456";
        
        String url = "jdbc:sqlserver://localhost:1433; databaseName = "+database+ ";";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Ko ket noi dc voi co so du lieu");
            e.printStackTrace();
        }
    }
    public ResultSet runProc(String procName, String [] args){
        try {
            CallableStatement cs;
            ResultSet rs = null;
            String sqlStr="";
            if (args == null)
            {
                sqlStr = "{call "+procName+ "}";
                cs = con.prepareCall(sqlStr);
            }
            else{
                int n, i;
                String doiso="";
                n = args.length;
                for (i=0; i<n; i++)
                {
                    doiso += args[i];
                    if (i!=n-1)
                    {
                        doiso +=",";
                    }
                }
                sqlStr = "{call "+procName + "(" + doiso +")}";
                cs = con.prepareCall(sqlStr);
            }
            
            rs = cs.executeQuery();
            return rs;
            
        } catch (Exception e) {
            return null;
        }
    }
}
