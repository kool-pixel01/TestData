package testJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InserRecordUsingStoreProcedure {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//Step 1 # Load class
Class.forName("com.mysql.cj.jdbc.Driver");
//Step 2 # Establish connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//Step 3 # call store Procedure
String sql="{call insertStudentRecord(?,?,?,?)}";
//Step 4 # create callableStatement(I) object
CallableStatement cs=con.prepareCall(sql);
cs.setInt(1,7);
cs.setString(2,"ggg");
cs.setString(3,"sus");
cs.setInt(4,30);

//Step 5 execute the sql query
cs.execute();
System.out.println(sql);

//Step 6 # close the database connection
cs.close();



	}

}
