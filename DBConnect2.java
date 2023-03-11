import java.sql.*;
class DBConnect2
{
public static void main(String[] args)
{
//register with driver
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");
//establish connection
Connection c=DriverManager.getConnection
("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
System.out.println("connection established");
//statement object
Statement stmt=c.createStatement();
//execute
String sql="create table professional2(sid integer primary key,sname varchar2(20))";
stmt.execute(sql);
System.out.println("table created");

}
catch(Exception e)
{
System.out.println(e);
}

}
}