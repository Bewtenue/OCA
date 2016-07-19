package com.softpath.serializacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
	public static void main(String[] args) {
		
		MXPresidents mxPresidents = new MXPresidents("Enrique Pena Nieto", "2012 - 2016", "PRI");
		System.out.println(mxPresidents);
		
		try
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MXPresidents.txt"));
			oos.writeObject(mxPresidents);
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
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("MXPresidents.txt"));
			Object obj = is.readObject();
			if(obj != null && obj instanceof MXPresidents)
			{
				MXPresidents president = (MXPresidents) obj;
				System.out.println(president);
			}
		}
		catch(FileNotFoundException f)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ClassNotFoundException ec)
		{
			System.out.println("Clase no encontrada");
		}
		
	}
}
