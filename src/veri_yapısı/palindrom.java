package veri_yapısı;

import java.util.Stack;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		String cumle = "kalas yok kütük koy salak";
		boolean flag = true;
		int uzunluk = cumle.length() / 2;
		for (int i = 0; i < uzunluk; i++) {
			s.push(cumle.charAt(i));
		}
		if (cumle.length() % 2 == 1)
			uzunluk++;
		for (int i = uzunluk; i < cumle.length(); i++) {
			char ch = (Character) s.pop();
			if (ch != cumle.charAt(i))
				flag = false;
		}
		if (flag)
			System.out.println("Palindrom.");
		else
			System.out.println("Palindrom Degildir.");

	}
}