package Project;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class LockedMe {

	public static void SelectOption() {
		System.out.println("1 Display all the File and Directory");
		System.out.println("2 Create a new file");
		System.out.println("3 Delete a file");
		System.out.println("4 Search a file");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  number");
		int select = scanner.nextInt();
		switch (select) {
		case 1:

			DisplayFile.file();

			break;

		case 2:

			System.out.println("f2nd option");
			break;
		default:
			System.out.println(" invalid option ");
		}
	}
}
