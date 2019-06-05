import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = {4,9,7,1,3,6,5};
		 Arrays.sort(Arr);
		 // print out [1,3,4,5,6,7,9]
		 System.out.println(Arrays.toString(Arr));
		 
		 
		// create a new linked list
			LinkedList<Integer> lst = new LinkedList<Integer>();
			
			// add elements
			lst.add(15); // [15]
			lst.add(19); // [15,19]
			lst.add(21);	// [15,19,21]
			lst.addFirst(13); // [13,15,19,21]
			lst.addLast(24); // [13,15,19,21,24]
			System.out.println(lst);
			
			// remove elements
			lst.removeFirst(); // [15,19,21,24]
			lst.removeLast(); // [15,19,21]
			lst.remove(19); // [15,21]
			System.out.println(lst);
		 
			
			// create a new stack
			Stack stack = new Stack();
			stack.push(new Integer(3)); // [3]
			stack.push(new Integer(5)); // [3,5]
			System.out.println(stack.peek()); // prints 5
			stack.push(new Integer(6)); // [3,5,6]
			Object x =  stack.pop();
			System.out.println(x); // prints 6
			System.out.println(stack); // prints [3,5]
		 
			
			Queue queue = new LinkedList();
			queue.add(2); // [2]
			queue.add(4); // [2,4]
			System.out.println(queue.peek()); // prints 2
			queue.add(5); // [2,4,5]
			queue.poll();
			System.out.println(queue); // prints [4,5]

	}

}
