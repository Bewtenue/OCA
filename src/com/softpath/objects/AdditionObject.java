package com.softpath.objects;

public class AdditionObject {

	public static void main(String[] args) {
		Addition ad = new Addition();
		Addition ad1 = new Addition();
		Addition ad2 = new Addition();
		ad.incrementCount();
		ad1.incrementCount();
		ad2.incrementCount();
		System.out.println(ad.getCount());
	}
}
