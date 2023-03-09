package coldemo.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "ansh", 11);
		Student s3 = new Student(3, "pranav", 12);
		Student s4 = new Student(4, "rakesh", 11);
		Student s5 = new Student(5, "krunal", 10);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sorting : ");
		
		System.out.println(list);
	}
}
