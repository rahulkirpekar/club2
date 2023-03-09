package club2.innerclassdemo;

public class A 
{
	private int no = 10;
	public void test()
	{
		class B
		{
			void msg() 
			{
				System.out.println("NO : " + no);
			}
		}
		B obj = new B();
		obj.msg();
	}
	public static void main(String[] args) 
	{
		A outer = new A();
		outer.test();
		
	}
}
