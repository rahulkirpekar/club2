package coldemo.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(43);
		list.add(2);
		list.add(76);
		list.add(23);
		list.add(7);

		Collections.sort(list);
		
		System.out.println("--> " + list);
		
	}
}
