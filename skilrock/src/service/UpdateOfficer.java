package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import varun.action.UpdateOfficerInfoAction;

public class UpdateOfficer {
	public static int updateOfficerInfo(UpdateOfficerInfoAction r){  
		int status=0;  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/skilrock","root","phikhu");  
		  
		PreparedStatement ps=con.prepareStatement("update officer set o_first=?,o_last=?,o_email=?,o_password=?,o_phone=?");  
		ps.setString(1,r.getO_first());  
		ps.setString(2,r.getO_last());  
		ps.setString(3,r.getO_email());  
		ps.setString(4,r.getO_password());  
		ps.setString(5,r.getO_phone());  
		          
		status=ps.executeUpdate();  
		  
		}catch(Exception e){e.printStackTrace();}  
		    return status;  
		}  
}