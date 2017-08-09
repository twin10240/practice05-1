package prob5;

public class MainApp {
	public static void test(MyStack<? extends Number> number) {
		
	}

	public static void main(String[] args) {
		try {
			MyStack<String> stack = new MyStack<String>(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				// 런타임 에러
				// generic을 사용하지 않으면 코드 작성시 타입 체크를 하지 않음
				// Integer s = (Integer)stack.pop();
				String s = stack.pop();
				
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack<String>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
			// generic 객체 생성(와일드 카드를 사용해서 제너릭 타입 제한하기)
//			MyStack<?> objectStack = new MyStack<String>(10);
			
			/*** 에러 ***/
//			MyStack<? extends Number> objectStack = new MyStack<Integer>(10);
//			objectStack.push(new Integer(10));
			
			/*** 가능 ***/ // -> 그 이유는??
			MyStack<? extends Number> objectStack = new MyStack<Integer>(10);
			test(objectStack);
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}
}