package language.basic;

public class PersonPhoneNumber {

	public static void main(String[] args) {
	String person1 = "Anna";
	String phone1 = "123-456-7890";
	
	String person2 = "Anandhu";
	String phone2  = "789-456-1230";
	
	String person3 = "Aamina";
	String phone3 = "963-258-7410";
	
	System.out.println(person1+"'s phone number is :" +phone1);
	System.out.println(person2+"'s phone number is :" +phone2);
	System.out.println(person3+"'s phone number is :" +phone3);
	
	// using print f
	System.out.printf("%s 's phone number is %s\n",person1,phone1 );
	System.out.printf("%s 's phone number is %s\n",person2,phone2 );
	System.out.printf("%s 's phone number is %s\n",person3,phone3);
	
			

	}

}
