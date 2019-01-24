package pack1;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			PrintWriter pw = new PrintWriter("mynotes3.txt");
			pw.print(100);
			pw.write(100);
			
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
