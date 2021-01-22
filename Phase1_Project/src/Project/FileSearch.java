package Project;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class FileSearch {

	public static void Search() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory where to search");
		String dirPath = scanner.nextLine();
		File directory = new File(dirPath);
		if (directory.isDirectory())
		{
		String[] flist = directory.list();
		int flag = 0;
		if (flist == null)
		 {
			System.out.println("Empty Dir!");

		 }else {

				
				for( int i = 0 ; i < flist.length ; i++)
{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the file to be searched.. ");
			String name = scan.next();
			name = flist[i];

				if (name.equalsIgnoreCase(name)) {
					System.out.println("file found");
					flag = 1;
				} 
			} 
				
			}if (flag == 0)
			{System.out.println("file not found");
			}

		} else
			System.out.println("Incorrect file path!");
	}
}
