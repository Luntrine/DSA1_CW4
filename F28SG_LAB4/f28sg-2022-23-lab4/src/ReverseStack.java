public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	/**
	 * The method creates a queue that will have every element of a stack pushed to it.
	 * The method then pushes all elements in the queue back onto the stack.
	 * Because of the nature of the stack and queue, the first element popped out of the
	 * original stack will be the first element popped back in, hence reversing the stack.
	 * 
	 * @param st stack that will be reversed
	 */
	public static void reverseStack(Stack st){
		
		int finalSize = st.size();
		
		Queue reverseQueue = new Queue(finalSize + 1);
		
		// The following code enqueues all elements of the of the stack.
		for(int i = 0; i < finalSize; i++){
			reverseQueue.enqueue(st.pop());
		}
		
		// The following code pushes all elements of the queue into the stack.
		for(int i = 0; i < finalSize; i++) {
			st.push(reverseQueue.dequeue());
		}
	}
	
	
	
	
}
