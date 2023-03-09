package collectionframework;

import java.util.Vector;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Student s = null;
		Vector<Student> list = new Vector<Student>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 6) 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) for Insert Student Record");
			System.out.println("2) for Update  By Rno Student Record");
			System.out.println("3) for Delete Student Record");
			System.out.println("4) for Display All Student Record");
			System.out.println("5) for Searching by Rno for Student Record");
			System.out.println("6) for Exit");
			choice = sc.nextInt();
			switch (choice) 
			{
				case 1:
						s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Student record suuccessfully Inserted");
						break;
				case 2:
						System.out.println("Enter Rno which you want to Update  : ");
						int searchRno = sc.nextInt();
						boolean flag = false;
						int i;
						for (i = 0; i < list.size(); i++) 
						{
							if (list.get(i).getRno() == searchRno) 
							{
								flag = true;
								break;
							}
						}
						if (flag) 
						{
							s = list.get(i);
							s.update();
							list.set(i, s);
							System.out.println("Student records successfully Updated");
						} else 
						{
							System.out.println("GivenRno not match in Students reccords");
						}
						break;
				case 3: System.out.println("Enter Rno which you want to Delete  : ");
						int deleteRno = sc.nextInt();
						flag = false;
						for (i = 0; i < list.size(); i++) 
						{
							if (list.get(i).getRno() == deleteRno) 
							{
								list.remove(i);
								flag = true;
								break;
							}
						}
						if (flag) 
						{
							System.out.println("Student records successfully Deleted");
						}else 
						{
							System.out.println("Student records not Deleted");
						}
						break;
				case 4:	for (int j = 0; j < list.size(); j++) 
						{
							s  = list.get(j);
							s.disp();
						}
						break;
				case 5:
						break;
				case 6:
						System.out.println("Student Application shutdown");
						Thread.sleep(1000);
						System.exit(0);
						break;
				default:
						break;
			}
			sc.close();
		}
	}
}