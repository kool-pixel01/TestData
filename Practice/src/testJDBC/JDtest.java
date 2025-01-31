package testJDBC;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDtest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int rno=Integer.parseInt(args[0]);
		String nm=args[1];
		String addr=args[2];

		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
		 * "root");
		 * 
		 * //String
		 * sql="create table student (rollNo int(4),name char(8),address char(20))";
		 * //String sql="insert into Student values(1,'aaa','Amravati')"; //String
		 * sql="insert into Student values("+rno+",'"+nm+"','"+addr+"')"; String
		 * sql="update student set address='Balewadi' where rollNo=1";
		 * System.out.println(sql); Statement smt=con.createStatement(); //
		 * smt.execute(sql); int k=smt.executeUpdate(sql); System.out.println(k);
		 * smt.close(); con.close();
		 */  
		  
		System.out.println("View All Employee");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/itcompany", "root","root");
		String sql="select * from employee";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
		}
		
		ps.execute();
		ps.close();

		 
	}

}
