package task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6 };
		IntToString(a);
	}

	static void IntToString(int[] a) {
		String s = "{";
		for (int i = 0; i < (a.length - 1); i++) {
			s = s + a[i] + ", ";
		}
		s = s + a[a.length - 1] + "}";
		System.out.println(s);
	}
}
