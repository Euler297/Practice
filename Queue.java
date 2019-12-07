package yee;

public class Queue {
	private int a[];
	private int front;
	private int rear;
	private int max;
	private int size;
	
	public Queue (int k) {
		max = k;
		a = new int [k];
		size = 0;
		front = rear = 0;
	}
	
	public int Enque (int e) {
		size++;
		a[(rear++) % max] = e;
		return 1;
	}
	
	public int Deque () {
		size--;
		return a[(front++) % max];
	}
	
	public int size () {
		return size;
	}
}
