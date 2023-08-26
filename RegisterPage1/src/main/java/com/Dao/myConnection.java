package com.Dao;

import java.sql.DriverManager;
import java.sql.*;
public class myConnection {

	public Connection getConnection() {

		Connection con=null;

				try {
					

					Class.forName("oracle.jdbc.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","123321");
					
					
					
				}catch(ClassNotFoundException e) {
					
					e.printStackTrace();
					
				}
				
				catch(SQLException e) {
					
				e.printStackTrace();
					
				
			}
				
				System.out.println(" In connection");
		
				
				return con;
	  }
					
}

