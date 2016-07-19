package com.softpath.innerclasses;

public class HelloAnonymousInnerClass {
	interface HelloWorld
	{
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello()
	{	
		
		
		//////////ENGLISH GREETING
		class EnglishGreeting implements HelloWorld
		{
			String name = "world";
			
			@Override
			public void greet() {
				greetSomeone("world");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
			
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		
		
		//////FRENCH GREETING
		HelloWorld frenchGreeting = new HelloWorld()
		{
			String name = "Bonjour";
			@Override
			public void greet() {
				greetSomeone("Bonjour");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println(name);
			}
		};
		////SPANISH GREETING
		HelloWorld spanishGreeting = new HelloWorld()
		{
			String name = "mundo";
			@Override
			public void greet() {
				greetSomeone("mundo");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
				
			}
			
		};
		
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Programmers");
		spanishGreeting.greet();
	}
	public static void main(String[] args) {
		HelloAnonymousInnerClass myGreetings = new HelloAnonymousInnerClass();
		myGreetings.sayHello();
		
		
		
	}
}


