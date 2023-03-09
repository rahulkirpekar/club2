package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestFileInoputStream 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("clubdata.txt");
			Scanner sc =  new Scanner(fin);
			
			String stmt = sc.nextLine();
			
			System.out.println(stmt);
			
			
//			int temp  = 0;			
//			while(	(temp = fin.read())	!= -1) 
//			{
//				System.out.print((char)temp);
//			}
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
