package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_102 {
	
	//public static void main(String args[]) throws Exception{
		@Test
		public void TC_102() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
	}
	}


