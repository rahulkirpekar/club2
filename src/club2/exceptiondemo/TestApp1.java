package club2.exceptiondemo;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans=0;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		try 
		{
			int a[] = new int[5];
			
			try 
			{
				a[5] = 100;
			} catch (Exception e) 
			{
				System.out.println("InnerCatch1 Handled");
				e.printStackTrace();
			}
			
			try 
			{				
				ans = no1 / no2;
			} catch (Exception e) 
			{
				System.out.println("InnerCatch2 Handled");
			}
			
			String name = null;

			try 
			{
				System.out.println("name.length() ---> " + name.length());
			} catch (Exception e) 
			{
				System.out.println("InnerCatch3 Handled");

				e.printStackTrace();
			}
		
			System.out.println("After 23 line");
		}catch(Exception e) 
		{
			ans = 0;
			System.out.println("Exception Catch Block---"+e + " - " + e.hashCode());
		}
		
		System.out.println("Addition : " + ans);
	}
}
