package language.basic;

public class EventTIme {

	public static void main(String[] args) {
		
		String music1 = "Karnadic music";
		String eventLocation1 = "Banglore";
		String time1 = "8 am";
		
		String Dance2 = "Kuchupadi";
		String eventLocation2 = "Chennai";
		String time2 = "6 pm";
		
		String Art = "Kathakali";
		String eventLocation3 = "kollam";
		String time3 = "5 pm";
		 
				System.out.println(" The " + music1 + " program will be on " + eventLocation1 + " at " +time1);
				System.out.println(" The " + Dance2 + " program will be on " + eventLocation2 + " at " +time2);
				System.out.println(" The " + Art + " program will be on " + eventLocation3 + " at " +time3); 
	System.out.printf("%-10s  %-10s    %-10s\n", "Event Name","Event Location","Event Time" );
	
	System.out.println("=========================================");
	
	System.out.printf("%-10s  %-10s    %-10s\n", "Music Fest","Kollam","5 pm" );
	
	System.out.printf("%-10s  %-10s    %-10s\n", "Dance Fest","Kochi","6 pm" );

	System.out.printf("%-10s  %-10s    %-10s\n", "Drawing","Coimbatore","10 am" );

	System.out.printf("%-10s  %-10s    %-10s\n", "Tech Expo","Banglore","8 am" );
	
	


	}

}
