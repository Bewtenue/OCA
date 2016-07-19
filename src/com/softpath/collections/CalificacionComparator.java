package com.softpath.collections;

import java.util.Comparator;

public class CalificacionComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.calificacion.compareTo(o2.calificacion);
	}
	
}
