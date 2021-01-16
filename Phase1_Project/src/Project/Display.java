package Project;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		System.out.println("Hello my name is Lakhan Sharma.");
		System.out.println("I am a full stack Java Developer.");
		System.out.println("On this application, You can create a file, delete a file of search a file form Directory");
		System.out.println();
		
		System.out.println("1 Display all the File and Directory");
		System.out.println("2 Create a new file");
		System.out.println("3 Delete a file");
		System.out.println("4 Search a file");
		Scanner scanner = new Scanner( System.in );
		 System.out.println("Enter the  number");
		 int select = scanner.nextInt();
		/// = outputMenu();
		
		//String option;
		//select = 1;
		switch(select)
		{
		case 1 :
			
			System.out.println("first option");
			LockedMe.DisplayItem();
			
			
		
		break;
		
		case 2:
			
			System.out.println("f2nd option");
			break;
		
		}
		
	}

}
