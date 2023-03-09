package collectionframework;

import java.util.ArrayList;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Float>list = new ArrayList<Float>();
		list.add(12);
		list.add("rahul");
		list.add(12.324);
		list.add(12.2345f);
		list.add('R');

		Student s = new Student();
		s.scan();
		list.add(s);
		
	}
}
