package language.basic;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Movies {

	public static void main(String[] args) {
		//Arrays
		String [] malayalamMovies = { "2018","Lucifer","Pulimurugan","Bheeshma Parvam","The Goat Life"};
	String	thirdMovie = "Pulimurugan";
		System.out.println("The third movie on the list is " + thirdMovie);
		//List
		List<String> movies = new ArrayList<>();
		movies.add("2018");
		movies.add("Lucifer");
		movies.add("Pulimurugan");
		movies.add("Bheeshma Parvam");
		movies.add("The Goat Life");
		String thirdPositionMovie = movies.get(2);
		System.out.println("THe third movie on the list is " +thirdPositionMovie);
		
		
	}

}
