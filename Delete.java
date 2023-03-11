import java.sql.*;

class Delete
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");

Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection established");

Statement stmt=c.createStatement();
String sql="delete from professional where sid=2";
int rows=stmt.executeUpdate(sql);
System.out.println(rows);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
