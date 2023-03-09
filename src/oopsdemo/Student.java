package oopsdemo;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
		System.out.println("Student - Default Constuctor");
	}
	public Student(int rno,String name) 
	{
		this();
		this.rno =rno;
		this.name=name;
	}
	public Student(int rno,String name,int std) 
	{
		this(rno,name);
		this.std =std;
	}
	void disp() 
	{
		scan();
		System.out.println(rno + " " + name + " " + std + " " + this);
	}
	
	private void scan() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start Main method");
		Student s= new Student(1, "rahul", 12);
		System.out.println(s);
		System.out.println("EXIt Main method");
	}
}
