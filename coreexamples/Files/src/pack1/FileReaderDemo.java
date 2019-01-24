package pack1;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			FileReader fr = new FileReader(new File("mynotes.txt"));
			
			int ch;
			while((ch = fr.read())!=-1){
				System.out.print((char)ch);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
