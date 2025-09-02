package language.basic;

public class CompanyEmployees {

	public static void main(String[] args) {
		String Employee1 = "Rahul";
		String Company1 = "BMW";
		
		String Employee2 = "Ramya";
		String Company2  = "IBM";
		
		String Employee3 = "Dharani";
		String Company3 = "XYZ";
		System.out.println("The Employee" + Employee1+ "is working in "+ Company1);
		System.out.println("The Employee" + Employee2+ "is working in "+ Company2);
		System.out.println("The Employee" + Employee3+ "is working in "+ Company3);
		
		System.out.printf("-%15s   %-15s \n", "Company Name","Employee Name" );
		System.out.println("===================================");
		System.out.printf("-%15s   %-15s \n","Cyber","Lolitha");
		System.out.printf("-%15s   %-15s \n","Technologic","Aishwarya");
		System.out.printf("-%15s   %-15s \n","Simple Coding","Nakshathra");
	}

}
