package jaeguyee;

public class hanoitop {
	public static int hanoiTakeOff (int n) {
		if (n == 1)
			return 1;
		return 2*(hanoiTakeOff(n-1)) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = hanoiTakeOff(5);
		
		System.out.println(k);
	}

}
