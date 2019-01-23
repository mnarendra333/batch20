package pack1;

import java.io.File;

public class FileDemo {
	
	
	public static void main(String[] args) {
		
		
		File file  =new File("C:\\");
		File[] listFiles = file.listFiles();
		
		for (File file2 : listFiles) {
			if(file2.isDirectory())
				System.out.println(file2.getName());
		}
		
		
		
		try {
			/*File f1 = new File("abc.txt");
			f1.createNewFile();*/
			
			//create folder/folders
			
			File f2 = new File("myfolder","sub-folder");
			f2.mkdirs();
			
			File f3 = new File("myfolder");
			
			//create a file inside a folder
			File f4 = new File(f3, "abc.txt");
			f4.createNewFile();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
