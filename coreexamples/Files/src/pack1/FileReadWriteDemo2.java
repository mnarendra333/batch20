package pack1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriteDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileWriter  fw = new FileWriter("targetfile2.txt");
			FileReader fr = new FileReader("targetfile.txt");
			
			int ch;
			while((ch = fr.read())!=-1){
				System.out.print(ch);
				
				fw.write(ch);
			}
			fw.flush();
		} catch (Exception e) {
		}

	}

}
