package com.softpath.collections;

import java.util.Arrays;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Student [] students = {new Student("id2","Jiamin",9.8),
				new Student("id6","Jose",7.6),new Student("id3","Pedro",8.3),
				new Student("id7","Lupe",9.9),new Student("id1","Rocio",5.7),
		};
		
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		
		System.out.println(Arrays.toString(students));
		
	}
	
	
	
}
