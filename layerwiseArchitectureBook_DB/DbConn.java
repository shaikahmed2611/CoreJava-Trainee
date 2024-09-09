package com.evergent.corejava.layerwiseArchitectureBook_DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmed","root","admin");
		return conn;
		
		
	}

}
