import java.sql.*;

class Update
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
String sql="update professional set sname='keerthi' where sid=5";
stmt.executeUpdate(sql);

}
catch(Exception e)
{
System.out.println(e);
}
}
}
