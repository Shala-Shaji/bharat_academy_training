package language.basic;

public class MaritalStatus {

	public static void main(String[] args) {
	String name1 = "Arjun";
	String status1 = "Married";
	
	
	String name2 = "Arun";
	String status2 = "Unmarried";
	
	String name3 = "Ammu";
	String status3 = "Married";
	//print ln
	System.out.println("Marrital status of "+name1 +" is "+ status1);
	System.out.println("Marrital status of "+name2 +" is "+status2);
	System.out.println("marrital status of "+name3 +" is "+status3);
	
	//print f
	System.out.printf(" Marital status of  %s is %s \n",name1,status1 );
	System.out.printf(" Marital status of  %s is %s \n",name2,status2 );
	System.out.printf(" Marital status of  %s is %s \n",name3,status3 );
	
	// print f 
	
	System.out.printf("%-18s %-10s\n","Person's Name","Marital Status");
	System.out.printf("%-18s %-10s\n","Arjun","Married");
	System.out.printf("%-18s %-10s\n","Arun","Unmarried");
	System.out.printf("%-18s %-10s\n","Ammu","Married");
	}

}
