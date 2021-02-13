import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
class JDBCProject{
public static void main(String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
int k;
System.out.println("Kashish Srivastava 079 \n");
System.out.println("Welcome to Student Details Management System!");
System.out.println("Enter your choice : Add a new Student(enter 1) : Remove a student(enter2) : Update student details(enter 3) ");
k=sc.nextInt();
System.out.println("Deleted successfully! ");
switch(k)
{ 
case 1: { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=97531");
        String n=JOptionPane.showInputDialog("Enter Name:");
		String s=JOptionPane.showInputDialog("Enter Roll no:");
		int i =Integer.parseInt(s);
		String sql = "INSERT INTO jdbcproject(name,roll_no) VALUE(?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, n);
		st.setFloat(2,i); 
		st.executeUpdate();
		st.close();
		con.close();
		System.out.println("Added successfully! ");
        }
case 2: { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=97531");
        String n=JOptionPane.showInputDialog("Enter Name:");
		String sql = "DELETE FROM jdbcproject where name=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, n);
		st.executeUpdate();
		st.close();
		con.close();
		System.out.println("Deleted successfully! ");
        }
case 3: { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=97531");
        String n=JOptionPane.showInputDialog("Enter New Name:");
		String s=JOptionPane.showInputDialog("Enter Roll no:");
		int i =Integer.parseInt(s);
		String sql = "UPDATE jdbcproject SET name=? WHERE roll_no=? ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, n);
		st.setFloat(2, i); 
		st.executeUpdate();
		st.close();
		con.close();
		System.out.println("Updated successfully! ");
        }
default: System.out.println("No changes made in the records");
}
}
}