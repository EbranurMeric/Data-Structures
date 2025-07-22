package veri_yapısı;

public class stack{
	private int top;
	private Object[] element;

	stack(int kapasite) {
		element = new Object[kapasite];
		top = -1;
	}

	void push(Object veri) {
		if (isFull())
			System.out.println("Diziniz tamamen doludur.");
		else
			top++;
		element[top] = veri;
	}

	Object pop() {
		if (isEmpty()) {
			System.out.println("Diziniz boş");
			return null;
		} else {
			Object retVeri = element[top];
			top--;
			return retVeri;
		}
	}

	Object peek() {
		if (isEmpty()) {
			System.out.println("Diziniz boş");
			return null;
		} else
			return element[top];
	}

	boolean isEmpty() {
		return (top == -1);
	}

	boolean isFull() {
		return (top + 1 == element.length);

	}

	int Size() {
		return top + 1;
	}
}