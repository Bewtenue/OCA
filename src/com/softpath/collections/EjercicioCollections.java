package com.softpath.collections;


/*
 * guardar objetos dentro de una coleccion y si se trata de guardar un objeto igual en
 * la coleccion, le diga al usuario que el objeto ya existe
 * 
*/

import java.util.ArrayList;
import java.util.List;
import com.softpath.ejerciciosherencia.A;

public class EjercicioCollections {
	
	
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        A guest = (A) obj;
        return  true;
        }
	
	public static void main(String[] args) {
		List<String> listaObjetos = new ArrayList<>();//en los parentesis se le puede poner el tamaño del arraylist
		
	}
}
