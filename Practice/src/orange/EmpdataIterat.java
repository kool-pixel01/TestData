package orange;

import java.util.ArrayList;
import java.util.List;

public class EmpdataIterat {
	public static void main(String args[]) {

List<EmployeeData> listdata=new ArrayList<EmployeeData>();
EmployeeData empdata=new EmployeeData();
empdata.setEmpID(01);
empdata.setEmpName("Tapesh");
empdata.setEmpUserName("tapesh");
empdata.setEmpPassword("tapesh@1234");
empdata.setMobileNumber(878789009);
empdata.setEmailID("tapesh@gmail.com");
empdata.setEmpAddress("Baner");

EmployeeData empdata1=new EmployeeData();
empdata1.setEmpID(02);
empdata1.setEmpName("Rutu");
empdata1.setEmpUserName("rutu");
empdata1.setEmpPassword("rutu@1234");
empdata1.setMobileNumber(878789009);
empdata1.setEmailID("rutu@gmail.com");

empdata1.setEmpAddress("Balewadi");



listdata.add(0, empdata);
listdata.add(1, empdata1);
for (EmployeeData employeeData : listdata) {
	
	if(employeeData.getEmpUserName().equals("rutu") && employeeData.getEmpPassword().equals("rutu@1234")) {
		System.out.println("EmpName "+employeeData.getEmpName());
		System.out.println("EmpUserName "+employeeData.getEmpUserName());
		System.out.println("EmpPassword "+employeeData.getEmpPassword());
		System.out.println("MobileNumber "+employeeData.getMobileNumber());
		System.out.println("EmailID "+employeeData.getEmailID());
		System.out.println("Addres "+employeeData.getEmpAddress());
		
	}
	
	
}




	}



}
