package Database;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appasaheb
 */
public class DBConnection {
    public static Connection getConnection()
	{
		Connection conn = null;

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/HibernateDemo","root","apple4");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return conn;
	}
    
}
