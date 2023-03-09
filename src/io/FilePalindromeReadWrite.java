package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FilePalindromeReadWrite 
{
	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j)) 
            {
            	return false;
            }    
            i++;
            j--;
        }
        return true;
    }
	public static void main(String[] args) 
	{
		FileOutputStream fout1 = null;
		FileOutputStream fout2 = null;
		Scanner input = null;
		String st = null;
		try 
		{
			 fout1 = new FileOutputStream("PalindromeList.txt");
			 fout2 = new FileOutputStream("NonPalindromeList.txt");
			File fin = new File("test1.txt");
			input = new Scanner(fin);
			while(input.hasNext()) 
			{
				st = input.next();
				st = st.toLowerCase().trim();
				byte b[] = st.getBytes();
				System.out.println(st);
				if(isPalindrome(st)) 
				{
					fout1.write(b);
					System.out.println("Success");
				}
				else {
					fout2.write(b);
					System.out.println("Success");
				}
				System.out.println("st --- " + st);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch(IOException e) 
		{
			e.printStackTrace();	
		}finally 
		{
			input.close();
			try 
			{
				fout2.close();
				fout1.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}