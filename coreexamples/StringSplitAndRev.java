
public class StringSplitAndRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "Today is Thursday";
		
		String[] elements = s1.split(" ");
		
		for(int i=0;i<elements.length;i++)
		{
			for (int j = elements[i].length()-1; j >=0; j--) {
				System.out.print(elements[i].charAt(j));
			}
			System.out.println();
		}

	}

}
