package com.softpath.objects;

import java.util.Scanner;
////////ARREGLAR PARA MAS DE 1 PALABRA
public class IdentificaPalindromos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder input = new StringBuilder(sc.nextLine());
		StringBuilder palindromo = new StringBuilder("");
		StringBuilder cleaner = new StringBuilder("");
		for(int i = 0;i<=input.length()-1;i++){
			if(input.charAt(i) == ' ')
				continue;
			cleaner = cleaner.append(input.charAt(i));
		}
		for(int i = cleaner.length()-1;i>=0;i--){
			palindromo = palindromo.append(cleaner.charAt(i));
		}
	
		System.out.println(palindromo.toString().equals(cleaner.toString()));
		
	}
}
