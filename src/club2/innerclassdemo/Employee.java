package club2.innerclassdemo;

public class Employee extends Person
{
	@Override
	public void test() 
	{
		System.out.println("Employee -- test()");
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.test();
		
		
	}
}
