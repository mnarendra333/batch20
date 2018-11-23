
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int numbers[] = {10,320,45,67,88,99};
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		System.out.println("==========ForEach================");
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
