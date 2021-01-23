package Project;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDelete {

	public static void dfile() {
		Scanner scanner = new Scanner( System.in );
		 System.out.println("\n Please Enter The Directory Path:");
		 String dirPath = scanner.nextLine();
		 File folder = new File(dirPath);
		 if(folder.isDirectory())
		 {
		 Scanner scanner1 = new Scanner(System.in);
			System.out.println("/n Enter the file file name");
		String file1 = scanner1.nextLine();
		String combined_path = new File(folder, file1).getPath();
		Path path = Paths.get(combined_path);
        try
        { 
        	
            Files.delete(path); 
            System.out.println("Deletion successful.");
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
         
    } else
    {
    	System.out.println("path not exist!");
    }
    }

	
 
}

