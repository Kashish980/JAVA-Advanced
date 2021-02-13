import java.sql.*;
class TestJDBC{

public static void main(String[] args) throws Exception
{
//1. Collect Database and Driver Info
String driverClassName = "com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost/jdbc";
String user="root";
String pwd= "97531";//root
//2. Load JDBC Driver / Register a Driver
Class.forName(driverClassName).newInstance();
//3. Open a Connection
Connection con = DriverManager.getConnection(url,user,pwd);
System.out.println("con---->"+con);
//4. Create Statement and execute sql
Statement st = con.createStatement();
String sql= "INSERT INTO emp1(name,salary) VALUE('Aman',256856.05)";

st.executeUpdate(sql);
//5. close st and con : use finally block
st.close();
con.close();
System.out.println("---SQL executed successfully---");
}
}
//C:\programs-jdbc>SET CLASSPATH=C:\programs-jdbc\mysql-connector-java-5.1.48;