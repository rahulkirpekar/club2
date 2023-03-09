package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilePalindromeString 
{
	
	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
            	return false;
            }    
            i++;
            j--;
        }
        return true;
    }
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st;
		st = sc.nextLine();
		st = st.toLowerCase();
		byte b[] = st.getBytes();
		try {	
			FileOutputStream fout1 = new FileOutputStream("FilePalindromeStringList.txt");
			FileOutputStream fout2 = new FileOutputStream("FileNonPalindromeStringList.txt");
			if(isPalindrome(st)) {
				fout1.write(b);
				fout1.close();
				System.out.println("Success");
			}
			else {
				fout2.write(b);
				fout2.close();
				System.out.println("Success");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
