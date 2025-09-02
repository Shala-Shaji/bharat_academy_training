package language.basic;

public class Assignment6UpdatedMarks {

	public static void main(String[] args) {
		String[] studentNames = {"Suresh","Mahesh","Naresh"}; 
		int [] marks = {85,90,92}; 
		int [] updatedMarks = new int[marks.length];
		
		for(int i=0;i<marks.length;i++) {
			 updatedMarks[i] = marks[i]+10;
		}
		System.out.println("Updated Marks : ");
		for(int i = 0;i < studentNames.length;i++) {
			System.out.println(studentNames[i] + " : " +  updatedMarks[i]);
		}
		int sum = 0;
		for (int i= 0; i< updatedMarks.length; i++); {
			int i = 0;
		sum += updatedMarks[i];
		
		}
		double average = sum /updatedMarks.length;
		System.out.println("Average Marks " +average);
	}

}
