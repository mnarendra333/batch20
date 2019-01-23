package pack1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("mynotes.txt");
			
			for(int i=65;i<=90;i++)
			{
				fw.write(i);
				
				fw.write(",");
			}
			fw.write("\n");
			for(int i=97;i<=122;i++)
			{
				fw.write(i);
				fw.write(",");
			}
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
