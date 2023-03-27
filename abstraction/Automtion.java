package org.abstraction;

public class Automtion extends  MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automtion A = new Automtion();
		A.java();
		A.python();
		A.selenium();
		A.ruby();

	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		 System.out.println("Selenium");
		
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
		
	}

}
