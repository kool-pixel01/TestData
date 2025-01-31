package testJDBC;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class GetDataUsingSPFromDBByrollNo {
	public static void main(String args[]) throws Exception {
		//Step 1 Load Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 Establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//Step 2 call store 
        String sql="{call getStudentDataByrollNo(?)}";
        
        //Step 3 Create CallableStatement(I) object
        CallableStatement cs=con.prepareCall(sql);
        cs.setInt(1, 6);
        
        //step 4 Execute query
        ResultSet se=cs.executeQuery();
        System.out.println("RollNo "+" Name"+" Address");
        if(se.next()) {
        	System.out.print(se.getInt(1));
        	System.out.print("   "+se.getString(2));
        	System.out.print("   "+se.getString(3));
        }
	}

}
