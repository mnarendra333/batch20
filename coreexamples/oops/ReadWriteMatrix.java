import java.util.Scanner;


public class ReadWriteMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int x[][] = new int[3][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.println("enter "+i+""+j+"th index");
				x[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}

	}

}
