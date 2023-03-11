import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;    
class Search extends Frame implements ActionListener
{
	Label l;
	TextField t;
	TextField t1;
	Button b;
	Search()
	{
	
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		l=new Label("Enter roll number");
		t=new TextField(20);
		t1=new TextField(30);
		b=new Button("Search");
		add(l);
		add(t);
		add(b);
		b.addActionListener(this);
		 addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });  
		
	}
	public void actionPerformed(ActionEvent e)
	{
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		PreparedStatement p=c.prepareStatement("select * from professional where sid=?");
		String id=t.getText();
		p.setString(1,id);
		ResultSet rs=p.executeQuery();
		int x=0;
		add(t1);
		while(rs.next())
		{
	//System.out.println(rs.getString(1)+" "+rs.getString(2));
	
		t1.setText(rs.getString(2));
		x++;
		}
		if(x==0)
		{
		t1.setText("record not found");
		}
	}
	catch(Exception f)
	{
		System.out.println(f);
	}
	}
   
	
}
class SearchDemo 
{
public static void main(String[] args)
{
Search s=new Search();
}
}
