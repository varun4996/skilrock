package action;

import varun.service.OfficerLogin;
public class OfficerLoginAction {
	private String o_email,o_password;
	public String execute(){
	    if(OfficerLogin.validate(o_email, o_password)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}

	public String getO_password() {
		return o_password;
	}

	public void setO_password(String o_password) {
		this.o_password = o_password;
	}

	public String getO_email() {
		return o_email;
	}

	public void setO_email(String o_email) {
		this.o_email = o_email;
	} 
}
