package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import varun.action.UpdatePlayerInfoAction;

public class UpdatePlayer {
	public static int updatePlayerInfo(UpdatePlayerInfoAction r){  
		int status=0;  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/skilrock","root","phikhu");  
		  
		PreparedStatement ps=con.prepareStatement("update player set first=?,last=?,email=?,password=?,phone=?");  
		ps.setString(1,r.getFirst());  
		ps.setString(2,r.getLast());  
		ps.setString(3,r.getEmail());  
		ps.setString(4,r.getPassword());  
		ps.setString(5,r.getPhone());  
		          
		status=ps.executeUpdate();  
		  
		}catch(Exception e){e.printStackTrace();}  
		    return status;  
		}  
}