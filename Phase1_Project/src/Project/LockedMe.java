package Project;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class LockedMe {

	public static void SelectOption() 
	{
		try
		{
		System.out.println("1 Display all the File and Directory");
		System.out.println("2 Create a new file");
		System.out.println("3 Delete a file");
		System.out.println("4 Search a file");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  number");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			DisplayFile  fd = new DisplayFile();
			fd.file();

			break;

		case 2:
			CreateFile  fc = new CreateFile();
			fc.Cfile();
			break;
			
		case 3:
			FileSearch fs = new FileSearch();
			fs.Search();
			break;
			
		default:
			System.out.println(" invalid option ");
		}
	}
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid input! You have to enter a number ");
		}
}

//	private static void CreateFile() {
//		// TODO Auto-generated method stub
//		
	}

