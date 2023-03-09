package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mainList = new ArrayList<String>();
		mainList.add("rahul");
		mainList.add("krunal");
		mainList.add("rakesh");
		mainList.add("ankur");
		mainList.add("ansh");
		
		
		ListIterator<String> itr = 	mainList.listIterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("backward Dirrection : ");
		
		while(itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		}
		
//		System.out.println(mainList);
//		mainList.set(2, "Rakesh Desjmukh");
		
//		mainList.add(2, "NeelBudhDev");

//		System.out.println(mainList);

//		mainList.add(3, "abcd");
//		System.out.println(mainList);

		
//		mainList.remove(1);
//		mainList.remove("Krunal");

//		System.out.println(mainList);

//		ArrayList<String> subList = new ArrayList<String>();
//		subList.add("rahul");
//		subList.add("krunal");
//		mainList.add("dhiraj");
		
//		System.out.println(subList);

//		mainList.retainAll(subList);
//		mainList.addAll(subList);
//		mainList.addAll(2, subList);
		
//		System.out.println(mainList);

//		mainList.clear();
		
//		List<String> list= mainList.subList(1, 3);
//		System.out.println(list);
		
		
		
		
		
		
	}
}
