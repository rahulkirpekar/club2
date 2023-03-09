package club2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// String 
		//		1) By Literal Way---HEAP-----String Constant Pool
		
//		String name1 = "Meet";
//		System.out.println("Name1 - "+name1.hashCode());

//		String name2 = new String("Meet");
//		System.out.println("By nem -- Name2 - "+name2.hashCode());

//		System.out.println("(name1==name2) - " + (name1==name2));
		
		
		//		2) By new KeyWord---HEAP
		
		
		
		
		StringBuffer name1 = new StringBuffer("rahul");
		System.out.println(name1 + " - " + name1.hashCode());		
		
		name1.append(" Kirpekar");

		System.out.println(name1 + " - " + name1.hashCode());		
		
	}
}
