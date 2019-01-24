package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step-1
		try {
			BufferedReader br = new BufferedReader(new FileReader("mynotes.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("targetfile.txt"));
			
			String data = null;
			while((data = br.readLine())!=null){
				System.out.println(data);
				bw.write(data);
			}
			bw.flush();
			
			
			
		
		} catch (Exception e) {
			// 
		}
		

	}

}
