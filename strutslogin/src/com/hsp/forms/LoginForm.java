package com.hsp.forms;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
     private String userName=null;
     private String password = null;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
}
