package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
public class TestApp8 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "krunal", 10);
		Student s3 = new Student(3, "rahul", 8);
		Student s4 = new Student(4, "ankur", 11);
		Student s5 = new Student(5, "sagar", 10);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		Collections.sort(list, new NameWiseStudentComparator());
		System.out.println("After Name Wise Sorting Data Display : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		Collections.sort(list, new StdWiseStudentComaprator());
		System.out.println("After Sortiung Data display : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
	}
}
