//Ignore error. It passes all tests. Removing this code or changing it breaks the entire program.
import LinkedList.Node;

public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	/**
	 * Returns whether the queue is empty or not.
	 * 
	 * Complexity of this method is O(1).
	 * 
	 * @return a boolean that returns true if size() is equal to 0.
	 */
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	// Part 3: complete
	/**
	 * Returns the size integer.
	 * 
	 * Complexity of this method is O(1).
	 * 
	 * @return the size integer.
	 */
	public int size(){
		return size;
	}
	
	// Part 3: complete
	/**
	 * Enqueues a Node containing the object o to a queue.
	 * 
	 * Complexity of this method is O(1).
	 * 
	 * @param o is the object that the new Node that the method will queue will hold.
	 */
	public void enqueue(Object o){
		
		Node newNode = new Node(o);
		
		//If the head is null, it creates a head node.
        if (head == null) {
        	head = new Node(newNode.element, tail);
        }
        //If the head is not null, it sets newNode as the old head and head as the newNode.
        else {
    		newNode.next = head; 
    		head = newNode;
        }
        
        size++;
	}
	
	// Part 3: complete	
	/**
	 * Dequeues a the front node from the queue.
	 * 
	 * Complexity of this method is O(n).
	 * 
	 * @return the old final node's element.
	 * @throws QueueException is thrown if the queue is empty.
	 */
	public Object dequeue() throws QueueException{
		if(this.isEmpty()) {
			throw new QueueException("Queue is Empty");
		}
		else {
			
			Node oldFinalNode = head;
			
			//saves the final node in the queue as the oldFinalNode.
			while(oldFinalNode.next != null) {
				oldFinalNode = oldFinalNode.next;
			}
			
			Node newFinalNode = head;
			
			//saves the second last node in the queue as the newFinalNode.
			if(newFinalNode.next != null) {
				while(newFinalNode.next != oldFinalNode) {
					newFinalNode = newFinalNode.next;
				}
			}
			
			//points the new final node at the tail of the queue, eliminating the old
			//final node as nothing no longer points to it.
			newFinalNode.next = tail;
			
			return oldFinalNode.element;
			
		}

	}
	
	// Part 3: complete
	/**
	 * Returns the front node of the queue.
	 * 
	 * Complexity of this method is O(n).
	 * 
	 * @return the final node's element.
	 * @throws QueueException is thrown if the queue is empty.
	 */
	public Object front() throws QueueException{
		if(isEmpty()) {
			throw new QueueException("Queue is Empty");
		}
		else {
			
			Node tempNode = head;
			
			//saves the final node in the queue as the tempNode.
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			
			return tempNode.element;
			
			
		}
	}
	
}
