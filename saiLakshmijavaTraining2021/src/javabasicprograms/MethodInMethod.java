package javabasicprograms;

public class MethodInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arithmetic a = new arithmetic();
a.div(a.multiply1(40, 2), a.multiply2(5, 2));
	}

}
