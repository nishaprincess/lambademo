package io.naztech.LambdaDemo;

import io.naztech.LambdaDemo.Test.FuncInter1;
import io.naztech.LambdaDemo.Test.FuncInter2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FuncInter1 add = (int x, int y) -> x + y;
		FuncInter1 multiply = (int x, int y) -> x * y;
		Test tobj = new Test();
		System.out.println("Addition is " + tobj.operate(6, 3, add));
		System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));
		FuncInter2 fobj = message -> System.out.println( message);
		fobj.sayMessage("Geek");
		fobj.sayMessage("Samia");
	}
}
