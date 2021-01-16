package Project;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class LockedMe {
	
	
	

	

	public static void DisplayItem()
	{
		//String file;
		//try
		
		Scanner scanner = new Scanner( System.in );
		 System.out.println("Enter the file path:");
		 String dirPath = scanner.nextLine();
		 File folder = new File(dirPath);
		
		
			File[] fileList = folder.listFiles();
			Arrays.sort(fileList);
			System.out.println("\nTotal number of items present in the directory:" + fileList.length);
				
			for(File file : fileList)
			
		 {
			
			System.out.println(file.getName());
		 }

			//catch(Execption e)
//		{
//		System.out.println("error");
//		}
	
	}

}
