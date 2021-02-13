import java.sql.*;
import javax.swing.JOptionPane;
class DynamicInsertPST {
public static void main(String[] args) throws Exception {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=97531");
String n=JOptionPane.showInputDialog("Enter Name:");
String s=JOptionPane.showInputDialog("Enter Salary:");
float fs=Float.parseFloat(s);
// ? : place holder or parameter (parameterized query)
String sql = "INSERT INTO emp1(name,salary) VALUE(?,?)";
PreparedStatement st = con.prepareStatement(sql);
//bind data in PST
st.setString(1, n);// 1 specifies the first parameter in the query
st.setFloat(2, fs); // 2 specifies the second parameter in the query
st.executeUpdate(); //no agrument
st.close();
con.close();
System.out.println("---SQL executed successfully---");
}
}
//insert during runtime