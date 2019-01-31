package io.naztech.LambdaDemo;

public class Test {
	interface FuncInter1 
    { 
        int operation(int a, int b); 
    } 
	interface FuncInter2 
    { 
        void sayMessage(String message); 
    } 
	int operate(int a, int b, FuncInter1 fobj) 
    { 
        return fobj.operation(a, b); 
    } 
  
}
