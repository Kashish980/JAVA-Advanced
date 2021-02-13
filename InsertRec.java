import java.sql.*;
class InsertRec{

public static void main(String[] args) throws Exception
{

String driverClassName = "com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost/jdbc";
String user="root";
String pwd= "97531";//root

Class.forName(driverClassName).newInstance();

Connection con = DriverManager.getConnection(url,user,pwd);
System.out.println("con---->"+con);
Statement st = con.createStatement();
String sql= "INSERT INTO kashishsrivastava(name,company  ,cat, items ,price) VALUE('Kashish Srivastava','X','Q',79,233.05)"; 
String sql1 = "INSERT INTO kashishsrivastava(name,company  ,cat, items ,price) VALUE('Tom','Y','P',5,2565.05)";

st.executeUpdate(sql);
st.executeUpdate(sql1);

st.close();
con.close();
System.out.println("---SQL executed successfully--- Kashish Srivastava 079");
}

}
//C:\programs-jdbc>SET CLASSPATH=C:\programs-jdbc\mysql-connector-java-5.1.48;