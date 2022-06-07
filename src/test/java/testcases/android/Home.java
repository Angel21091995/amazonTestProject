package testcases.android;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import screens.androidpageobjects.AmazonHomePageAndroid;
import screens.androidpageobjects.LandingPageAndroid;

public class Home {
	public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public AmazonHomePageAndroid AmazonHomePage = new AmazonHomePageAndroid();

    @Test(priority = 1, enabled = true)
    @Description("Verify Valid login for Amazon")
    public void verifyValidLogin() throws Exception {

     //   System.out.println("verifyValidLogin: " + driver);
        LandingPage.tapSignInOnLandingPage();
        LandingPage.enterNumberOrEmail();
        LandingPage.tapContinueBtn();
        LandingPage.enterPassword();
        LandingPage.tapSignInSubmit();
        AmazonHomePage.tapAction_bar_burger_icon();
        String VALIDATEUSRNAME = AmazonHomePage.getusrname_display_burger();

        System.out.println("VALIDATEUSRNAME" + VALIDATEUSRNAME);
        assertEquals(VALIDATEUSRNAME, "Hello, sudhanshu");

}}
