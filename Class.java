package Package01;
import java.util.Scanner;

public class Class {
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�迭�� ũ��: ");
		int length = s.nextInt();
		
		if (length <= 0) {
			length = s.nextInt();
		}
		
		int a[] = new int[length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]: ", i);
			a[i] = s.nextInt();
		}
		
		System.out.print("ã�� ��(���) : ");
		int num = s.nextInt();
		
		int i = 0;
		
		for (i = 0; i < a.length; i++) {
			if (a[i] == num)
				break;
		}
		
		
		if (i == a.length)
			System.out.print("�迭�� �ش� ���� �������� �ʽ��ϴ�.");
		else
			System.out.printf("%d�� a[%d]�� �ֽ��ϴ�.", num, i);
	}

}
