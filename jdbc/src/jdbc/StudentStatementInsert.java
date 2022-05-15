package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/naseerdb1";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","9885922578");
		Connection con= DriverManager.getConnection(url,p);
		Statement st = con.createStatement();
		String query = "insert into student value(123, 'Ahmed' ,45)";
		int i = st.executeUpdate(query);
		boolean t = st.execute("insert into student value(456, 'Roshan' ,55 )");
		System.out.println("no of rows affected"+i);
		System.out.println("query executed"+t);
		System.out.println("Row inserted successfully");
		st.close();
		con.close();
		
		
		
		
		
	}

	}