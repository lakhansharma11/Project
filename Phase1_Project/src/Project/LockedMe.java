package Project;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LockedMe {

	public static void SelectOption() {
		{
			try {

				System.out.println("");
				System.out.println("\n========================================================================");
				System.out.println("\n Select 1-- Display all the File and Directory");
				System.out.println("\n Select 2-- To create a file, delete a file and search a file form Directory");

				System.out.println("\n 3--Exit");
				Scanner scanner = new Scanner(System.in);
				System.out.println("\n Enter your choice:\t");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
					System.out.println("\n You have selected option 1: Display all the File and Directory.....");
					DisplayFile.file();
					LoopBack.navigate();

					break;

				case 2:
					System.out.println("\n Ye have selected 2nd option, Below are the sub menu");
					LockedMe.SelectSubOption();
					break;

				case 3:
					System.out.println("\n Closing your application........ \n Thank you!");
					System.exit(0);
				default:
					System.out.println("\n invalid option ");
					LockedMe.SelectOption();
					break;
				}

			} catch (InputMismatchException ex) {
				System.out.println("\n Invalid input! ");
				LockedMe.SelectOption();
			}

		}
	}

	public static void SelectSubOption() {
		try {
			System.out.println("\n========================================================================\n");
			
			System.out.println("\n Sub Menu");
			System.out.println("\n 1--Create a new file");
			System.out.println("\n 2--Delete a file");
			System.out.println("\n 3--Search a file");
			System.out.println("\n 4--Back to Main Menu");
			System.out.println("\n 5--Exit");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n Enter your choice:\t");
			int input = scanner.nextInt();
			switch (input) {

			case 1:
				CreateFile fc = new CreateFile();
				fc.Cfile();
				LoopBack.navigate();
				break;

			case 2:
				FileDelete fde = new FileDelete();
				fde.dfile();
				LoopBack.navigate();
				break;

			case 3:
				FileSearch call = new FileSearch();
				call.Search();
				LoopBack.navigate();

				break;
			case 4:
				LockedMe a = new LockedMe();
				a.SelectOption();

				break;
			case 5:
				System.out.println("\n Closing your application........ \n Thank you!");
				System.exit(0);
			default:
				System.out.println("\n invalid option ");
				LockedMe.SelectSubOption();
				break;
			}

		} catch (InputMismatchException ex) {
			System.out.println("\n Invalid input! ");
			LockedMe.SelectSubOption();

		}
	}
}
