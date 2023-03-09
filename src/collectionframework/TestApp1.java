package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.scan();
		ArrayList listObj = new ArrayList();
		listObj.add(10);//0<=====itr-------Integer.valueOf(10)// AutoBoxing 
		listObj.add(10.325f);//1
		listObj.add(10.2134);//2
		listObj.add('R');//3
		listObj.add("Royal");//4
		listObj.add(s);//5
		listObj.add(true);//6

		Iterator itr = listObj.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
//---------------------------------------------------		
//		for(Object obj  : listObj) 
//		{
//			System.out.println(obj);
//		}
//---------------------------------------------------				
//		for(int i=0;i<listObj.size();i++) 
//		{
//			System.out.println(listObj.get(i));
//		}
	}
}
