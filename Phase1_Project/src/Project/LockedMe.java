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
				System.out.println("1 Display all the File and Directory");
				System.out.println("2 Create a new file");
				System.out.println("3 Delete a file");
				System.out.println("4 Search a file");
				System.out.println("5 Exit");
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the  number");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
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
					System.exit(0);
				default:
					System.out.println(" invalid option ");
				}
			
		} catch (InputMismatchException ex) {
			System.out.println("Invalid input! ");
		}
	}
	}

		
}
