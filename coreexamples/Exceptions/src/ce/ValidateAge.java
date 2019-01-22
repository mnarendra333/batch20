package ce;

import java.util.Scanner;

public class ValidateAge {
	
	
	
	
	public static void validate(int age) throws InvalidAgeException{
		
		if(age<18)
			throw new InvalidAgeException("age is less than 18");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agae");
		int age = sc.nextInt();
		try {
			ValidateAge.validate(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("create registation");
		
		
	}

}
