import java.sql.*;
class fetch
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver registered");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			System.out.println("connection established");
			Statement s=c.createStatement();
			String sql="select * from professional";
			ResultSet rs=s.executeQuery(sql);
			while(rs.next()){
			System.out.print(rs.getInt("sid")+" ");
			System.out.println(rs.getString("sname"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}