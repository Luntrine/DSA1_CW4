import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/* 2: complete the following test methods as specified. */
	
	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		assertEquals(true, q.isEmpty());
	}
	
	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		q.enqueue(1);
		// then test that q is not an empty queue.
		assertEquals(false, q.isEmpty());
	}

	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		assertEquals(0, q.size());
	}
	
	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue
		q.enqueue(1);
		// then test the size of the queue
		assertEquals(1, q.size());
	}

	@Test
	public void testEnqueue() {
		// enqueue an element(s) to the queue
		q.enqueue(2);
		q.enqueue(1);
		// then test that the correct element is at the front
		assertEquals(2, q.front());
	}
	
	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		// then check that they are returned in the
		// correct order with dequeue.
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		q.dequeue();
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		q.front();
	}
}
