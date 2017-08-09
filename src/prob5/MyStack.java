package prob5;

public class MyStack<E>  {
	private E[] myStack;
	private int length;
	private int top;
	
	public int getTop() {
		return top;
	}

	@SuppressWarnings("unchecked")
	public MyStack(int length) {
		this.top = -1;
		this.length = length;
//		myStack = new E[length];
		
//		Array.newInstance(object.getClass(), length);
//		myStack = (E[])Array.newInstance(Object.class, length);
		myStack = (E[]) new Object[length];
	}

	public int getLength() {
		return length;
	}

	public void push(E str) {
		if(top == myStack.length - 1) { //stack is full
			resize();
		}
		
		myStack[++top] = str;
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		E[] temp = (E[]) new String[ myStack.length * 2 ];

		for( int i = 0; i <= top; i++ ) {
			temp[ i ] = myStack[ i ];
		}

		myStack = temp;
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