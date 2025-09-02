package language.basic;

public class MovieRating {

	public static void main(String[] args) {
		Double rating = 7.5;
		System.out.println("The rating of the movie is " + rating);
		System.out.printf("Rating of old movie is %.1f\n", rating  );
		
		float rating1 = 9.1f;
		System.out.println("The rating of the movie is : "  +rating1);
		System.out.printf("The rating of previous movie is %.1f\n", rating1);
	   
		 System.out.printf("%-15s %-20s%n", "Movie Name", "Movie Rating");
		System.out.println("====================================");
		
		
		 System.out.printf("%-15s %-20.1f%n", "Another", 5.9);
	        System.out.printf("%-15s %-20.1f%n", "Battle", 8.9);
	        System.out.printf("%-15s %-20.1f%n", "Clever", 7.7);
	        System.out.printf("%-15s %-20.1f%n", "Daughter", 9.9);
		
		
	
	}

}
