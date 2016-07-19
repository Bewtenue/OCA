package com.softpath.inheritance;
//Una clase final se puede instanciar, mas no se puede heredar

public final class FinalClassObject{
	public static void main(String[] args) {
		FinalClassObject obj = new FinalClassObject();
		//sobre el uso de "instanceof"
		String s = "Hello";
		
		if(s instanceof java.lang.String);
			System.out.println("Es una instancia de String");
		
	}
}
