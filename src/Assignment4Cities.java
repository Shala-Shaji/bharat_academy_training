package language.basic;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Cities {

	public static void main(String[] args) {
		/*int [] cityAreas = {5000,6000,7000,8000,9000};
		
		int thirdCity = cityAreas[2];
		int fourthCity = cityAreas[3];
		int total = thirdCity + fourthCity;
		System.out.println("The total Areas of 3rd and 4th cities are " +total); */
		
		//Using List
		List<Integer> cityAreas = new ArrayList<>();
		cityAreas.add(5000);
		cityAreas.add(6000);
		cityAreas.add(7000);
		cityAreas.add(8000);
		cityAreas.add(9000);
		
		
		int thirdCity = cityAreas.get(2);
		int fourthCity = cityAreas.get(3);
		int total = thirdCity+fourthCity;
		System.out.println("The areas of third and the fourth cities are " +total);
		
		
	}

}

