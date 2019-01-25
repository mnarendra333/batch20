package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationandDeeserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student student = new Student(101,"Surya",500);
		
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			
			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student desestudent = (Student)ois.readObject();
			System.out.println(desestudent);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
