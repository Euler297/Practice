package Package02;
import java.util.Scanner;

public class Sorts {
	
	static int BinSearch (int a[], int c) {
		int left, right, middle;
		
		left = 0;
		right = a.length -1;
		middle = (left + right) / 2;
		
		do {
			if (a[middle] == c) {
				return middle;
			}
			else if (a[middle] > c) {
				right = middle - 1;
			}
			else
				left = middle + 1;
			return -1;
		} while (left > right);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열의 크기: ");
		int length = s.nextInt();
		
		if (length <= 0) {
			length = s.nextInt();
		}
		
		int a[] = new int[length];
		
		System.out.println("오름차순으로 입력하시오.");
		
		System.out.print("x[0]: ");
		a[0] = s.nextInt();
		
		for (int i = 1; i < length; i++) {
			do {
					System.out.printf("x[%d]: ", i);
					a[i] = s.nextInt();
				} while (a[i] < a[i-1]);
			}
		
		System.out.print("찾을 수 : ");
		int num = s.nextInt();
		
		int print = BinSearch (a, num);
		
		if (print == -1)
			System.out.println("찾는 값이 배열에 없습니다.");
		else
			System.out.printf("%d은(는) a[%d]에 있습니다.", num, print);
	}

}
