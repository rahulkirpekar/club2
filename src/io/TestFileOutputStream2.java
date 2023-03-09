package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TestFileOutputStream2 
{
	public static void main(String[] args) 
	{
		// write -- OutputStream -- FileOutputStream(Write---file)
		// read  -- InputStream -- FileInputStream(read---file)
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// abc
		byte b[] = name.getBytes();// b[0]-97,b[1]-98 , b[2]--99
		try 
		{
			FileOutputStream fout = new FileOutputStream("testrcd.txt");
			fout.write(b);
			fout.close();
			System.out.println("Successfully content write in Text File");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
//			System.out.println(e);// display exception  message only
			e.printStackTrace();// display with [exception message + Exception Error log]
		}
	}
}
