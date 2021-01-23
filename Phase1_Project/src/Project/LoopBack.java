package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopBack {
	public static void navigate()
	{
		try {
		System.out.println("\n========================================================================\n");
		System.out.println("\n ");
		System.out.println("\n 1--Back to Sub Menu");
		System.out.println("\n 2--back to Main Menu");
		System.out.println("\n 3--Close the Application");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter your choice:\t");
		int input = scanner.nextInt();
		switch (input) {
		
		case 1:
			LockedMe b = new LockedMe();
			b.SelectSubOption();
			
			break;
			
		case 2:
			LockedMe a = new LockedMe();
			a.SelectOption();
			
			break;

		
		case 3:
			System.out.println("\n Closing your application........ \n Thank you!");
			System.exit(0);
		default:
			System.out.println("\n invalid option ");
			LockedMe b1 = new LockedMe();
			b1.SelectSubOption();
			break;
	}
	
	}catch (InputMismatchException ex) {
		System.out.println("\n Invalid input! ");
		LockedMe b = new LockedMe();
		b.SelectSubOption();
		
}
	}

}
