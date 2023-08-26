package com.Dao;
import java.util.*;
import com.Model.*;
import com.Controller.*;
import java.sql.*;
public class implementDao {

		myConnection c=new myConnection();
		
	
		public int saveRecord(List<Model_Student>mlist) {
			
			Connection con=c.getConnection();
			Model_Student ms=mlist.get(0);
			int i=0;
			
			try {
				
				PreparedStatement ps=con.prepareStatement("INSERT INTO practice VALUES(?,?,?,?)");
				ps.setInt(1, ms.getRoll_No());
				ps.setString(2,ms.getStude_Name());
				ps.setString(3,ms.getUser_Name());
				ps.setString(4, ms.getPass());
				
				i=ps.executeUpdate();
				
				
				
			}catch(SQLException e) {
				
				
				e.printStackTrace();
			}
			
			
			return i;
		}
		
		public void deleteRecord() {
				
				
		}
		
		
		
	
}
