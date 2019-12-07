package yee;
import java.util.Scanner;
import yee.Queue;

public class realclass {

	public static void main (String [] args) {
		// TODO auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Queue size: ");
		int b = s.nextInt();
		
		Queue q = new Queue (b);
		
		int function;
		
		do {
			System.out.printf("Data: %d/%d\n", q.size(), b);
			System.out.print("1: Enque || 2: Deque || 0: Terminate || Enter: ");
			function = s.nextInt();
			switch (function) {
			
			case 1: 
				if (q.size() == b) {
					System.out.println("Wrong Input.");
					break;
				}
				System.out.print("Enter a data: ");
				int enq = s.nextInt();
				q.Enque(enq);
				break;
				
			case 2:
				if (q.size() == 0) {
					System.out.println("Wrong Input.");
					break;
				}
				System.out.printf("Deque-ed data is %d.\n", q.Deque());
				break;
			}
		} while (function != 0);
	}
}
