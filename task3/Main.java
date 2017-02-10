package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number:");
		String bin = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(bin);
		String text = sb.reverse().toString();
		char[] t = text.toCharArray();
		int[] a = new int[t.length];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			char d = text.charAt(i);
			int b = d - 48;
			a[i] = b;
		}
		for (int i = 0; i < a.length; i++) {
			x = a[i] * (int) Math.pow(2, i) + x;
		}
		String r = Arrays.toString(a);
		System.out.println("This decimal number is:"+x);
	}

}
