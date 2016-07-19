package com.softpath.objects;
//programa que imprime la inversion de una cadena
public class ReverseString {
	public static void main(String[] args) {
		String string = "Jesus";
		StringBuilder reverse = new StringBuilder(10);
		for(int i = string.length()-1;i>=0;i--){
			reverse.append(string.charAt(i));
		}
		System.out.println(reverse);
		
		
		//ejemplo del uso del split
		String partido = "hola a todos esto es una cadena";
		String a[] = partido.split(" ");
		for(int j = 0;j<a.length;j++){
			System.out.println(a[j]);
		}
		
	}
}
