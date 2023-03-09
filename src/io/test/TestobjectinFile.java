package io.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestobjectinFile 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		try 
		{
			FileOutputStream fout = new FileOutputStream("test10.txt");
		
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			out.close();
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
