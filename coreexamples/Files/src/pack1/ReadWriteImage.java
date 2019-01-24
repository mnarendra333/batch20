package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileInputStream source = new FileInputStream("C:\\Users\\sapuser\\Pictures\\img1.png");
			FileOutputStream dest = new FileOutputStream("d:\\targetimage.png");
		
			int data;
			while((data = source.read())!=-1){
				dest.write((char)data);
			}
			System.out.println("file has been copied");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
