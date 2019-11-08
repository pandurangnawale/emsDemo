package daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.EmsDao;
import model.Employee;
import utility.ConnectionManager;

public class EmsDaoImpl implements EmsDao{

	@Override
	public void getAllEmployeeList() {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		
		try
        {  
			   //Class.forName("com.mysql.jdbc.Driver"); 
               //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");			   
               //Statement stmt=con.createStatement();
			   //ResultSet rs=stmt.executeQuery("select * from employeemaster");
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			String sql="select * from employeemaster";
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);			
               while(rs.next()) 
               {
                  list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7)));
               }
               con.close();  
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
		System.out.println(list);
	}

}
