package com.softpath.generics;

public class PairTest<T1, T2> {

	private T1 object1;
	private T2 object2;
	
	PairTest(T1 one,T2 two)
	{
		object1 = one;
		object2 = two;		
	}
	
	public T1 getFirst()
	{
		return object1;
	}
	
	public T2 getTwo()
	{
		return object2;
	}
	
	public static void main(String[] args) {
		PairTest<Integer,String> worldCup = new PairTest<Integer,String>(2014,"Brasil");
		System.out.println("World cup " + worldCup.getFirst() + "in " + worldCup.getTwo());
	}
}
