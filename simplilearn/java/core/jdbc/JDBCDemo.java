package simplilearn.java.core.jdbc;

import java.sql.*;
public class JDBCDemo
{
	public static void jdbcMain() throws SQLException
	{
		//Creating the connection
		String url = "jdbc:mysql://localhost/sql_store?"+
		"user=root&password=Hop3fullyTh!sIsStrongEnough4@ll";
		
		Connection conn = null;
		
		int rollno = 1;
		String first_name = "John";
		String last_name = "Elderberg";
		int age = 20;
		
		String sql = "insert into customers(first_name, last_name, birth_date, address, city, state) "
				+ "values ('"+ first_name +"', '" + last_name + "', '1990-01-01', 'bethany lane', 'chicago', 'IL');";
		
		
		try {
			
			// Load the Driver:
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			int m = st.executeUpdate(sql);
			
			if(m == 1)
			{
				System.out.println("Inserted row successfully : " + sql);	
			}
			else
			{
				System.out.println("Insertion failed");
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		finally 
		{
			conn.close();
		}
		
	}
}
