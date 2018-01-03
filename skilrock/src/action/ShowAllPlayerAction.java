package action;

import java.sql.*;  
import java.util.ArrayList; 
import varun.Player;

public class ShowAllPlayerAction {
	ArrayList<Player> list=new ArrayList<Player>();  
	  
	public ArrayList<Player> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Player> list) {  
	    this.list = list;  
	}  
	public String execute(){  
	 try{  
		 Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/skilrock?autoReconnect=true&useSSL=false","root","phikhu");  
	              
	  PreparedStatement ps=con.prepareStatement("select * from player");  
	  ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next()){  
		Player player=new Player();  
		player.setP_first(rs.getString(1));  
		player.setP_last(rs.getString(2));  
		player.setP_email(rs.getString(3));  
		player.setP_phone1(rs.getString(5));  
	   list.add(player);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}
