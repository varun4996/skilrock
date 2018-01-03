package action;

import varun.service.UpdateOfficer;

public class UpdateOfficerInfoAction {
	private String o_first="bhjkl",o_last,o_password,o_email,o_phone;
	public String execute(){
	    int i=UpdateOfficer.updateOfficerInfo(this);  
	    if(i>0){  
	    return "success";  
	    }  
	    return "error";  
	}
	public String getO_last() {
		return o_last;
	}
	public void setO_last(String o_last) {
		this.o_last = o_last;
	}
	public String getO_first() {
		return o_first;
	}
	public void setO_first(String o_first) {
		this.o_first = o_first;
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
	public String getO_phone() {
		return o_phone;
	}
	public void setO_phone(String o_phone) {
		this.o_phone = o_phone;
	}
}