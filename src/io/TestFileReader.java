package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("test1.txt");
			int temp = 0;
			while(	(temp =fr.read() )  != -1	)
			{
				char value = (char)temp;
				System.out.print(value);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
