package com.softpath.innerclasses;

public class SomeClass {
	
	void someFunction()
	{
		class Local
		{
			public void print()
			{
				System.out.println("Hola desde la inner class");
			}
			
			public void print1()
			{
				System.out.println("Printing from print1");
			}
		}
		
		Local local = new Local();
		local.print();
	}
	
	void otherMethod()
	{
		/*no se puede hacer por que el alcance de la clase Local es dentro del metodo
		 * someFunction()
		Local local = new Local();
		local.print();
		*/
	}
	
	
	public static void main(String[] args) {
		SomeClass some = new SomeClass();
		some.someFunction();
	}
}
