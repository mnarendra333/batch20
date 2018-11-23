import java.lang.reflect.Array;
import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data[] = {"act","cat","man"};
		
		//char[] charArray = data[0].toCharArray();
		//char[] charArray2 = data[1].toCharArray();
		
		
		
		for (String string : data) {
			
			char[] charArray = string.toCharArray();
			Arrays.sort(charArray);
			
			System.out.println("===============");
			for (char c : charArray) {
				System.out.print(c);
			}
			
		}
		
		
		/*Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println("=================");
		for (int i = 0; i < charArray2.length; i++) {
			System.out.print(charArray2[i]);
		}*/
		
		
		
		
		
		

	}

}
