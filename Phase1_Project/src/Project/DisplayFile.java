package Project;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayFile {
	//String file;
			//try
			//{
	public static void file()
	{
			Scanner scanner = new Scanner( System.in );
			 System.out.println("Enter the file path:");
			 String dirPath = scanner.nextLine();
			 File folder = new File(dirPath);
			
			 if(folder.isDirectory())
			 {
				File[] fileList = folder.listFiles();
				Arrays.sort(fileList);
				int length = fileList.length;
			if(length >0)
			{
				System.out.println("\nTotal number of items present in the directory:" + fileList.length);
			
				for(File file : fileList)
				
			 {
				
				System.out.println(file.getName());
//			 }
	//
//				catch(Exception e)
//		{
//					System.out.println("error");
//		}
			}
			}else
			{
			System.out.println("Empty folder");	
			}
			}
				else
			{
				System.out.println("path not exist!");
			}
		
		}

}
