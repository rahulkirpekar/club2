package club2.innerclassdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Person p = new Person() 
		{
			@Override
			public void test() 
			{
				System.out.println("Person -- test()---"+ this);
			}
		};
		p.test();
	}
}
