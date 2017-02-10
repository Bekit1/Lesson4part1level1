package task4;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter form;
		String s = "";
		for (int i = 2; i < 12; i++) {
			form = new Formatter();
			s = "%." + Integer.toString(i) + "f";
			form.format(s, Math.PI);
			System.out.println(form.toString());
			form.close();
		}
	}
}
