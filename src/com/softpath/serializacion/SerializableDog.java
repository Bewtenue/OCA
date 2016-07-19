package com.softpath.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;


public class SerializableDog implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private String direccion;
	
	public SerializableDog(String id,String nombre,String direccion)
	{
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	@Override
	public String toString(){
		return "ID: "+ id + " Nombre: "+ nombre + " Direccion: "+ direccion;
	}
	
	public static void main(String[] args) {
		int i = 0;
		SerializableDog[] dogs = new SerializableDog[5];
		LinkedList<SerializableDog> linkedList = new LinkedList<>();
		SerializableDog dog1 = new SerializableDog("12345", "Manchas", "Calle Manchas # 100");
		SerializableDog dog2 = new SerializableDog("23456", "Firulais", "Calle Firulais # 200");
		SerializableDog dog3 = new SerializableDog("34567", "Rocky", "Calle Rocky # 300");
		SerializableDog dog4 = new SerializableDog("45678", "Franky", "Calle Franky # 400");
		SerializableDog dog5 = new SerializableDog("56789", "Canuto", "Calle Canuto # 500");
		linkedList.add(dog1);
		linkedList.add(dog2);
		linkedList.add(dog3);
		linkedList.add(dog4);
		linkedList.add(dog5);
		
		try
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializableDog.txt"));
			oos.writeObject(linkedList);
			oos.close();
			System.out.println(linkedList);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo no encontrado");
		}
		catch(IOException e)
		{
			System.out.println("Excepcion en la entrada/salida de datos");
		}
		
		try{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("SerializableDog.txt"));
			Object obj = is.readObject();			
			System.out.println("DESPUES DEL DE-SERIALIZE");			
			if(obj != null )
			{
				System.out.println(obj);
			}
		}
		catch(FileNotFoundException f)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
		//	System.out.println(e.getMessage());
		}
		
		catch(ClassNotFoundException ec)
		{
			System.out.println("Clase no encontrada");
		}
		
	}
	
	
}
