package com.saral.training.Java.markerInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utility {

	public static void serialize(Object obje) throws IOException{
		System.out.println("loading file");
		File f= new File("config.properties");
		FileOutputStream file = new FileOutputStream(f);
		ObjectOutputStream obj = new ObjectOutputStream(file);
		System.out.println("writing file");
		obj.writeObject(obje);
		obj.flush();
		obj.close();
		file.close();
	}
	
	public static Object deSerialize()throws IOException,
	ClassNotFoundException{
		
		File f= new File("config.properties");
		FileInputStream  file = new FileInputStream(f);
		ObjectInputStream  obj = new ObjectInputStream(file);
		System.out.println("writing file");
		Object ob=obj.readObject();
		
		obj.close();
		file.close();
		
		return ob;
	}
	
}
