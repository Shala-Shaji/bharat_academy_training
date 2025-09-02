package language.basic;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Numbers {

	public static void main(String[] args) {
		//Array
		int [] numbers = {10,20,30,40,50,60,70,80,90,100};
		int fifthValue = numbers[4];
		int sixthValue = numbers[5];
		int average = numbers[5] + numbers[4] /2;
		System.out.println("The Average of 5th and 6th value is : " +average);
	}
	//List
	{
	List<Integer> numbers = new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	numbers.add(60);
	numbers.add(70);
	numbers.add(80);
	numbers.add(90);
	numbers.add(100);
	
	int fifthValue = numbers.get(4);
	
	int sixthValue = numbers.get(5);
	
	double average = fifthValue + sixthValue /2 ;
	System.out.println("The average of 5th and 6th values are " + average);
	
	
}}
	


