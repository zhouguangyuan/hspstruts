package com.struts.action;

import com.struts.form.LoginForm;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm f = (LoginForm) form;
		//System.out.println("ÓÃ»§Ãû="+f.getUser());
		if ("123".equals(f.getPwd())) {
			request.setAttribute("name", f.getUser());
			return mapping.findForward("wel");
		} else {
			return mapping.findForward("err");
		}
	}

}
