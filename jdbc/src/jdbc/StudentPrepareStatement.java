package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPrepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/naseerdb1","root","9885922578");
			pt= con.prepareStatement("insert into student1 values(?,?,?)");
			pt.setInt(1, 1);
			pt.setString(2, "Naseer");
			pt.setInt(3, 20);
			int i = pt.executeUpdate();
			System.out.println("no.of rows affected:"+i);
			System.out.println("rows insterted successfully");
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {}
		try {
			if(pt!=null);
			pt.close();
			pt=null;
		}
       catch(Exception e){
			
		}
		
		try {
			if(con!=null);
			con.close();
			con=null;
			
		}
		catch(Exception e){
			
		}
		
		}
	}