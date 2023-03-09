package collectionframework;

import java.util.LinkedList;
import java.util.Iterator;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		LinkedList<Object>  list = new LinkedList<Object>();
		list.add("rahul");
		list.add(12);
		list.add('R');
		list.add(324.41);
		list.add(234.3124f);
		list.add(true);
		list.add(new Student(1, "rahul", 12));

		Iterator<Object> itr =  list.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());;
		}
	}
}
