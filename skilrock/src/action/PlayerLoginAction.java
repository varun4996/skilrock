package action;

import varun.service.*;  
public class PlayerLoginAction {
	private String p_email,p_password;   
	public String execute(){
	    if(PlayerLogin.validate(p_email, p_password)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public String getP_password() {
		return p_password;
	}
	public void setP_password(String p_password) {
		this.p_password = p_password;
	}
}