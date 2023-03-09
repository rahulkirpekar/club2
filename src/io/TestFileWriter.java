package io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		String name = "rahul kirpekar";
		try 
		{
			FileWriter fw = new FileWriter("test1.txt");
		
			fw.write(name);
		
			fw.close();
			System.out.println("Successfully Write in file");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
