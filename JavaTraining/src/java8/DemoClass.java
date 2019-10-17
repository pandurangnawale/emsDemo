package java8;

import java.util.ArrayList;

public class DemoClass extends Object implements test,test2{

	@Override
	public void func(int x, String y) {
		test.super.func(x, y);
		test2.super.func(x, y);
	}

	
public static void main(String[] args) {
	DemoClass demoClass=new DemoClass();
	demoClass.func(10, "abc");
	System.out.println(demoClass.toString());

}
ArrayList al;

}