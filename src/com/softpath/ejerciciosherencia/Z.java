package com.softpath.ejerciciosherencia;

public class Z extends E{
	public Z() {
	}
	

	public static void main(String[] args) {
		Z z = new Z();
		if(z instanceof A)
			System.out.println("Z es instancia de A");
		else
			System.out.println("Z no es intancia de A");
		if(z instanceof E)
			System.out.println("Z es instancia de E");
		else
			System.out.println("Z no es intancia de E");
	}
}
