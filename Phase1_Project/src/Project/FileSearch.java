package Project;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class FileSearch {

	public static void Search()  //throws Exception 
    { 
		Scanner scanner = new Scanner( System.in );
		 System.out.println("Enter the file path:");
		 String dirPath = scanner.nextLine();
		 File folder = new File(dirPath);
        String[] flist = folder.list(); 
        int flag = 0; 
        if(folder.isDirectory())
        {
        if (flist == null) { 
            System.out.println("Empty directory."); 
        } 
        else { 
        	Scanner filen = new Scanner( System.in );
   		 System.out.println("Enter the file name to search:");
   		 String filename = filen.nextLine();
//   		 String aa = new File(filename);
//          String aa = aa1.isFile()
  
            // Linear search in the array 
            for (int i = 0; i < flist.length; i++) { 
                String filenamea = flist[i]; 
                if (filenamea.equals(filename)) { 
                    System.out.println(filename + " found"); 
                    flag = 1; 
                } 
            } if (flag == 0) { 
                System.out.println("File Not Found"); 
        } 
  
        
        }
		
    } else
    {
    	System.out.println("path not exist!");
    }
    }
}