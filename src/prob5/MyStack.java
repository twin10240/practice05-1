package prob5;

public class MyStack  {
	private Object[] myStack;
	private int length;
	private int top;
	
	public int getTop() {
		return top;
	}

	public MyStack(int length) {
		this.top = -1;
		this.length = length;
		myStack = new String[length];
	}

	public void push(String str) {
		myStack[++top] = str;
	}

	public boolean isEmpty() {
		return top < 0? true : false;
	}

	public String pop() throws MyStackException {
		String val = "";

		if (top < 0) {
			throw new MyStackException("Stack is empty");
		}else{
			val = (String)myStack[top--];
		}
		
		return val;
	}
}