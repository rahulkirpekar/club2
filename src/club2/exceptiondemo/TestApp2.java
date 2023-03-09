package club2.exceptiondemo;

import java.io.IOException;

public class TestApp2 
{
	public static void isValidAgeForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			throw new InvalidAgeException("Invalid Age for Vote");
		} else 
		{
			System.out.println("Welcome For Vote");
		}
	}
	public static void main(String[] args) 
	{
		
		try {
			isValidAgeForVote(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After method call ");
	}
}
