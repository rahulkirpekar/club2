package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTestApp 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		Statement stmt = null;
		Connection conn = DbConnection.getConnection();
		int rowsAffectecd = 0 ;
		if (conn!= null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffectecd = stmt.executeUpdate(insertQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("EmployeeTestApp - insert()--Db not Connected");
		}
		return rowsAffectecd;
	}
	public void update() 
	{

	}
	public int delete(int id) 
	{
		String deleteQuery ="DELETE FROM employee WHERE id = "+id;
		Statement stmt = null;
		Connection conn = DbConnection.getConnection();
		int rowsAffected =0 ;
		if (conn!=null) 
		{
			try {
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeTestApp - delete()--Db not Connected");
		}
		return rowsAffected;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		Connection conn = DbConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();

				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String salary = rs.getString(3);
					String dsgn = rs.getString(4);
					String orgName = rs.getString(5);
					
					ebean =  new EmployeeBean(id, name, salary, dsgn, orgName);
					list.add(ebean);
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeTestApp - getAllRecords() Db not connected");
		}
		return list;
	}

	public static void main(String[] args) 
	{
//		EmployeeBean ebean = new EmployeeBean(0, "rahul", "12000", "SE", "Royal");
//		int rowsAffected = e.insert(ebean);
		
		
		EmployeeTestApp e = new EmployeeTestApp();
		
		ArrayList<EmployeeBean> list = e.getAllRecords();
		
		for (int i = 0; i < list.size(); i++)
		{
			EmployeeBean bean =  list.get(i);
			System.out.println(bean.getId() + " " + bean.getName() + " " + bean.getSalary() + " " +bean.getDsgn() + " " + bean.getOrgName());
		}
		
//		System.out.println("Enter Id which you want to delete : ");
//		int choice =new Scanner(System.in).nextInt();
//		int rowsAffected = e.delete(choice);
//		if (rowsAffected  > 0 ) 
//		{
//			System.out.println("Employee records successfully Deleted");
//		} else 
//		{
//			System.out.println("not Deleted");
//		}
		
	}
}
