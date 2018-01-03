package action;

import varun.service.UpdatePlayer;

public class UpdatePlayerInfoAction {
	private String first,last,password,email,phone; 
	public String execute(){
	    int i=UpdatePlayer.updatePlayerInfo(this);  
	    if(i>0){  
	    return "success";  
	    }  
	    return "error";  
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
