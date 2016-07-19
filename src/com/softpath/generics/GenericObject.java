package com.softpath.generics;

import com.softpath.objects.Box;

class BoxPrinter<T>
{
	private T val;
	
	public BoxPrinter(T arg)
	{
		val = arg;
	}
	
	@Override
	public String toString()
	{
		return "[" + val + "]";
	}
	
	public T genericMethod()
	{
		return val;
	}
	
	
}

public class GenericObject {

	public static void main(String[] args) {
		
		BoxPrinter<Integer> value = new BoxPrinter<Integer>(new Integer(3));
		System.out.println(value);
		BoxPrinter<String> value1 = new BoxPrinter<String>("Hello from Generics");
		System.out.println(value1);
		
		
		
	}
	
	
	
	
	
}
