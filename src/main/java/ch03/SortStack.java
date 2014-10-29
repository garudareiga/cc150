package ch03;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Question 3.6
 * 
 * Write a program to sort a stack in ascending order (with the biggest items on top)
 * May use at most one additional stack to hold items.
 */

public class SortStack {
	private Stack<Integer> sortStack;
	private Stack<Integer> swapStack;
		
	public void push(Integer e) {
		while (!sortStack.isEmpty()) {
			if (e >= sortStack.peek())
				break;
			swapStack.push(sortStack.pop());
		}
		sortStack.push(e);
		while (!swapStack.isEmpty())
			sortStack.push(swapStack.pop());
	}
	
	public Integer pop() {
		if (sortStack.isEmpty())
			throw new EmptyStackException();
		Integer e = sortStack.pop();
		return e;
	}
	
	public Integer peek() throws EmptyStackException {
		if (sortStack.isEmpty())
			throw new EmptyStackException();
		return sortStack.peek();
	}
	
	public boolean isEmpty() {
		return sortStack.isEmpty();
	}
}
