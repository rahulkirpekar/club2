package collectionframework;

import java.util.PriorityQueue;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		queueObj.add("rahul");
		queueObj.add("krunal");
		queueObj.add("rakesh");
		queueObj.add("ankur");
		queueObj.add("krunal");
		queueObj.add("rakesh");
		queueObj.add("ansh");
		
		System.out.println(queueObj.size());
		
		System.out.println(queueObj);
	}
}
