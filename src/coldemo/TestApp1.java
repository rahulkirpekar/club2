package coldemo;

import java.util.Vector;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 1----2----4----5---6
		Student s = new Student(1, "neel", 12);
		Vector listobj = new Vector();
		listobj.add("rahul");//0
		listobj.add('R');//1
		listobj.add(12);//2
		listobj.add(true);//3
		listobj.add(12.21f);//4
		listobj.add(21212121);//5
		listobj.add(s);//6
	
		for(int i=0;i<listobj.size();i++) 
		{
			Object obj = listobj.get(i);
			if (obj instanceof Student) 
			{
				Student s2 = (Student)obj;
				s2.disp();
			} else 
			{
				System.out.println(listobj.get(i));
			}			
		}
				
//		System.out.println("listobj - " + listobj.size());
//		System.out.println(listobj.get(1));
//		String name = (String)listobj.get(0);
//		System.out.println(name.charAt(1));
	}
}
