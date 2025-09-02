package language.basic;

import java.util.ArrayList;

import java.util.List;


public class Assignment4TouristAttractions {

	public static void main(String[] args) {
		String [] touristPlace = { "Hawai Mahal","Taj Mahal","Effel Tower","Red Fort","Statue of Liberty","Statue of unity","Pyramids","Bakel kotta","Golden Temple","Jadayu Para"};
		for(String places : touristPlace ) {
		System.out.println("The famous tourist places are :" );
		System.out .println("*********************************");
		System.out.println(places);
		
		
		} 
		
		for (int i = 0;i < touristPlace.length; i++) {
			System.out.println(touristPlace[i]);
			System.out.println(touristPlace[5]);
			
		}
	
		List<String> touristPlaces = new ArrayList<>();
		touristPlaces.add("Hawai Mahal");
		touristPlaces.add("Taj Mahal");
        touristPlaces.add("Effel Tower");
        touristPlaces.add("Red Fort");
        touristPlaces.add("Statue of Liberty");
        touristPlaces.add("Statue of unity");
        touristPlaces.add("Pyramids");

        touristPlaces.add("Bakel kotta");
        touristPlaces.add("Golden Temple");
        touristPlaces.add("Jadayu Para");
        
        System.out.println("Top 10 TOurist Placces are :");
        for( String places : touristPlaces) {
        System.out.println(places);
        }
        //List in for loop
      for (int i= 0; i<touristPlaces.size();i++) {
        	System.out.println(touristPlaces.get(i));
        }
	}
	
 
	}
	

