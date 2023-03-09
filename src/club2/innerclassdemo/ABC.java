package club2.innerclassdemo;

public class ABC 
{
	static int no=100;
	static class DEF
	{
		void msg() 
		{
			System.out.println("no - " + no);
		}
	}
	public static void main(String[] args) 
	{
		ABC.DEF obj = new ABC.DEF();
		
		obj.msg();
		
	}
}
