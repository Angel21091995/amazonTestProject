package testcases.android;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Home {
	 @Test(priority = 3, enabled = true)
	    @Description("Logout from Amazon")

	    public void verifyLogout() throws Exception {

	       
	        System.out.println("tapAction_bar_burger_icon");

	       
	        System.out.println("tapSetting_bar_burger");

	       
	        System.out.println("tapSign_out_setting_burger");

	      
	        System.out.println("tapSign_out_popup");

	    }

}
