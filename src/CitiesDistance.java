package language.basic;

public class CitiesDistance {

	public static void main(String[] args) {
		String city1 = "Thiruananthapuram";
		String city2 = "Kochi";
		Float distance = 200.5f;
		
		System.out.println("The distance between " + city1 + " and " + city2 + " is " + distance );
		
		System.out.printf("The distance between %s and %s is %.1f \n", city1,city2,distance);

	}

}
