package io.test;

import java.io.File;

public class TestApp1 
{
	 public static void main(String[] args) 
	 {
		 File file = new  File("C:\\Users\\Royal\\eclipse-workspace\\club2\\src\\io\\test");
		 String files[] = file.list();
		 for (String name : files) 
		 {
			 System.out.println(name+" Can Write: "+"file.canWrite() Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes"); 
		}
	}
}
