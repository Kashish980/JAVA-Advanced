import java.sql.*;
class AccountRec{

public static void main(String[] args) throws Exception 
	{
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/jdbc";
        String user = "root";
        String pwd = "97531";
		
        Class.forName(driverClassName).newInstance();
		
        Connection con = DriverManager.getConnection(url, user, pwd);
		
        System.out.println("con---->" + con);
  
        Statement st = con.createStatement();
        
		
		String sql2="DELETE FROM k_JDBC_Bank where name='Kashish'";
		String sql3 = "UPDATE k_JDBC_Bank SET name='Hank' where name='Kashish'";
		st.executeUpdate(sql2);
		st.executeUpdate(sql3);
		
        st.close();
        con.close();
        System.out.println("---SQL executed successfully---Kashish Srivastava 079");
		
    }
}