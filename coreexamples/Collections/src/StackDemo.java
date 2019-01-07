import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "pragim";
		
		
		Stack stack = new Stack();
		for (int i = 0; i <s1.length(); i++) {
			stack.push(s1.charAt(i));
		}
		
		System.out.println(stack);
		while(!stack.isEmpty()){
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}
