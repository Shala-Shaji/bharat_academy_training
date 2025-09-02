package language.basic;

public class Assignment2EmployeesUsingArrays {

String empName1 = "Bharath";
String empName2 = "ABC";
String empName3 = "XYZ";

int EmpID1 = 1234;
int EmpID2 = 1235;
int EmpID3 = 1236;

public static void main(String[] args) {
	
Assignment2EmployeesUsingArrays emp = new Assignment2EmployeesUsingArrays();

 String [] names = {emp.empName1,emp.empName2,emp.empName3};
 int [] ids = { emp.EmpID1,emp.EmpID2,emp.EmpID3 };

System.out.println("Employee Name is " + names[0] + ", Employee ID is " + ids[0]);
System.out.println("Employee Name is " + names[1] + ", Employee ID is " +ids[1]);
System.out.println("Employee Name is " + names[2] + ", Employee ID is " +ids[2]);


}
}