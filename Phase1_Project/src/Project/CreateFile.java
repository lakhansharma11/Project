package Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class CreateFile {
	public static void Cfile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file path:");
		String dirPath = scanner.nextLine();
		File folder = new File(dirPath);

		if (folder.isDirectory()) {
			{
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("/n Enter the file file name");
			String file1 = scanner1.nextLine();
				File file = new File(folder,file1); 

				try {
					if (file.createNewFile())
						System.out.println("/n File created!");
					else
						System.out.println("/n File already exists!");

				} catch (IOException e) {
					
					System.out.println("/n Incorrect file path!");
					e.printStackTrace();
				} 
			

			}
		} else {
			System.out.println("/n path not exist!");
		}
	}
}
