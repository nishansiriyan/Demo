package ListConcept;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {

	static void stackpush(Stack<Integer>st, int element) {
		st.push(Integer.valueOf(element));
		System.out.println("push(" + element + ")");
		System.out.println("stack: " + st);
	}

	static void stackpop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	static void stackpeek(Stack<Integer> st) {
		System.out.println("Peek eklement:" + st.peek());
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);
		stackpush(st, 10);
		stackpush(st, 20);
		stackpush(st, 30);
		stackpush(st, 40);
		stackpush(st, 50);
		stackpeek(st);
		stackpop(st);
		stackpop(st);
		stackpush(st, 60);
		stackpeek(st);
		stackpop(st);
		stackpop(st);
		stackpeek(st);
		stackpop(st);
		stackpop(st);

		// Checking stack
		System.out.println("Checking stack:" + st.empty());
		try {
			stackpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}

	}

}
