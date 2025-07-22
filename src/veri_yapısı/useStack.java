package veri_yapısı;

import java.util.Stack;

public class useStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push('a');
		s.push("ali");
		s.push("elif");
		s.push('5');
		s.push(12);
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		char c=(Character)s.pop();
		System.out.println(c);
		System.out.println(s.peek());
		
		

	}

}
