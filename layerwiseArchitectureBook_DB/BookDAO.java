package com.evergent.corejava.layerwiseArchitectureBook_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class BookDAO {
	public int addBook(BookBean b1)
	{
		Connection conn=null;
		
		try
		{
			conn=DbConn.getConnection();
			String str="insert into bookdetail values(?,?,?,?)";
	       PreparedStatement pstmt=conn.prepareStatement(str);
	       pstmt.setInt(1,b1.getBookId());
	       pstmt.setString(2, b1.getBookName());
	       pstmt.setInt(3, b1.getPrice());
	       pstmt.setString(4, b1.getGrade());
	       int i=pstmt.executeUpdate();
		
		  
		    
		    return i;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}
	public ArrayList  getBookDetail() throws Exception
	{
		ArrayList al=new ArrayList();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet res=null;
		conn=DbConn.getConnection();
		String str="select * from bookdetail";
		pst=conn.prepareStatement(str);
		res=pst.executeQuery();
		while(res.next())
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			int price=res.getInt(3);
			String grade=res.getString(4);
			String s1="Id = "+id+" Name = "+name+"\n price = "+price+"\n grade = "+grade;
			al.add(s1);
		}
		return al;
		
		
	}
	public int delRow(int bookid1) throws Exception
	{
		Connection conn=null;
		PreparedStatement pst=null;
		conn=DbConn.getConnection();
		String str="delete from bookdetail where bookid=?";
		
		pst=conn.prepareStatement(str);
		pst.setInt(1, bookid1);
		int res=pst.executeUpdate();
		conn.close();
		return res;
		
		
		
	}

}
