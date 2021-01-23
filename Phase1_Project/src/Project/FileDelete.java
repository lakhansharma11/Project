package Project;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDelete {

	public static void dfile() {
		DisplayFile fd = new DisplayFile();
	fd.file();
		Scanner sc = new Scanner(System.in);
  		 System.out.println("Enter the file name to search:");
  		 Path filename = Paths.get(sc.next());
        try
        { 
        	
            Files.deleteIfExists(filename); 
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
          
         
    } 
 
}

