package collectionframework;

import java.util.TreeMap;
import java.util.Map;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "Pandya Yash");
		map.put(4, "Patel Meet");
		map.put(1, "Surani Neel");// entry---(key,value)
		map.put(2, "Budhdev Neel");
		map.put(5, "Kirpekar Rahul");
		
		for(Map.Entry e	: map.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
