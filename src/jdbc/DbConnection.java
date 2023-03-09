package jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DbConnection 
{
	public static Connection getConnection() 
	{
		Connection conn=null;
		try(FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\club2\\dbconfig.properties"))
		{
			Properties prop = new Properties();
			prop.load(fin);
			
			String URLNAME = prop.getProperty("URLNAME");
			String DRIVERCLASS = prop.getProperty("DRIVERCLASS");
			String USERNAME = prop.getProperty("USERNAME");
			String PASSWORD = prop.getProperty("PASSWORD");
			try 
			{
				// 1) load Driver class
				Class.forName(DRIVERCLASS);
				// 2) pass credential to DriverManager's getConnection method
				conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
				// 3) validate conn object
				if(conn!=null) 
				{
					System.out.println("Db connected - " + conn);
				}else
				{
					System.out.println("Db Not connected");
				}
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return conn;
	}
}