package com.softpath.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetObject {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Orange");
		lhset.add("Grapes");
		lhset.add("Lemmons");
		lhset.add(null);
		lhset.add("Banana");
		
		System.out.println(lhset);
		
	}
}
