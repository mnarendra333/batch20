package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedWriter  bw = new BufferedWriter(new FileWriter("mynotes2.txt"));
			
			char ch[] = {'a','e','i','o','u'};
			
			bw.write(ch);
			bw.newLine();
			bw.write(99);
			bw.write("99");
			bw.flush();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
