import java.sql.*;

class Insert
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
String sql="insert into professional values(1,'bindu')";
stmt.executeUpdate(sql);
String sql1="insert into professional values(5,'ramya')";
stmt.executeUpdate(sql1);

}
catch(Exception e)
{
System.out.println(e);
}
}
}
