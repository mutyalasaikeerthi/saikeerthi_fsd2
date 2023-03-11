import java.sql.*;
import java.util.*;
class dynamic
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver registered");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			System.out.println("connection established");
			Scanner sc=new Scanner(System.in);
			String sql="insert into professional values(?,?)";
			PreparedStatement stmt=c.prepareStatement(sql);
			String name=sc.nextLine();
			int id=sc.nextInt();
			stmt.setInt(1,id);
			stmt.setString(2,name);
			
			int i=stmt.executeUpdate();
			System.out.println(i);
			c.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}