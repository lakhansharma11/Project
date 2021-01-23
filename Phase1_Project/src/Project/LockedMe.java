package Project;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class LockedMe {

	public static void SelectOption() {
		while (true) {
		try {
			 
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("========================================================================");
				System.out.println("\n 1--Display all the File and Directory");
				System.out.println("\n 2--Create a new file");
				System.out.println("\n 3--Delete a file");
				System.out.println("\n 4--Search a file");
				System.out.println("\n 5--Exit");
				Scanner scanner = new Scanner(System.in);
				System.out.println("\n Enter the  number\n");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
					System.out.println("\n You have selected option 1: Display all the File and Directory.....");
					DisplayFile fd = new DisplayFile();
					fd.file();

					break;

				case 2:
					CreateFile fc = new CreateFile();
					fc.Cfile();
					break;
					
				case 3:
					FileDelete fde = new FileDelete();
					fde.dfile();
					break;

				case 4:
					FileSearch call = new FileSearch();
					call.Search();

					break;
				case 5:
					System.out.println("\n Closing your application........ \n Thank you!");
					System.exit(0);
				default:
					System.out.println("\n invalid option ");
				}
				
			
		} catch (InputMismatchException ex) {
			System.out.println("\n Invalid input! ");
		}
		
	}
	}

		
}
