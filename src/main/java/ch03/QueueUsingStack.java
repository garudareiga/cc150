package ch03;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Question 3.5
 * 
 * Implement a MyQueue class which implements a queue using two stacks.
 */

public class QueueUsingStack {
	public class MyQueue1<T> {
		/*
		 * enqueue operation is const time
		 * better solution than MyQueue2, only one transformation
		 * between inStack and outStack.
		 */
		private Stack<T> inStack;
		private Stack<T> outStack;
		
		public void enqueue(T e) {
			inStack.push(e);
		}
		
		public T dequeue() throws EmptyStackException {
			if (inStack.isEmpty() && outStack.isEmpty())
				throw new EmptyStackException();
			if (outStack.isEmpty()) {
				while (!inStack.isEmpty()) {
					outStack.push(inStack.peek());
					inStack.pop();
				}
			}
			T e = outStack.pop();
			return e;
		}
	}
	
	public class MyQueue2<T> {
		/*
		 * dequeue operation is const time
		 */
		private Stack<T> inStack;
		private Stack<T> outStack;
		
		public void enqueue(T e) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.peek());
				inStack.pop();
			}
			inStack.push(e);
			while (!outStack.isEmpty()) {
				inStack.push(outStack.peek());
				outStack.pop();
			}
		}
		
		public T dequeue() throws EmptyStackException {
			if (inStack.isEmpty())
				throw new EmptyStackException();
			T e = inStack.pop();
			return e;
		}
	}
	
	public class MyQueue3<T> {
		/*
		 * Using only one stack
		 */
		private Stack<T> inStack;
		
		public void enqueue(T e) {
			inStack.push(e);
		}
		
		public T dequeue() throws EmptyStackException {
			if (inStack.isEmpty())
				throw new EmptyStackException();
			if (inStack.size() == 1) {
				T e = inStack.pop();
				return e;
			}
			T e = inStack.pop();
			T r = dequeue();
			inStack.push(e);
			return r;
		}
	}
}
