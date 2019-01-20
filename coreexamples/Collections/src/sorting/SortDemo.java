package sorting;

public class SortDemo {

	static int array[] = { 38, 24, 67, 86, 45, 39, 66 };

	void bubbleSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - 1; j++)
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	void print(int array[]) {

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

	public static void main(String[] args) {
		
		SortDemo obj = new SortDemo();
		obj.bubbleSort(array);
		System.out.print("Sorted Array" +" ");
		obj.print(array);
		

	}

}
