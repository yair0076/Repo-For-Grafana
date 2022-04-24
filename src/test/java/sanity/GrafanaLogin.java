package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaFlows;


public class GrafanaLogin extends CommonOps {

    @Test(description = "Test01_displyTitleLogin")
    @Description("this test verify the title login page")
    public void Test01_displyTitleLogin()
    {
        Verifications.VerifyVisitableElement(grafana_Login.title_login);
    }
    @Test(description = "Test02_displyEmailNote")
    @Description("this test verify the email and user name sentence")
    public void Test02_displyEmailNote()
    {
        Verifications.VerifyVisitableElement(grafana_Login.word_emailorusername);
    }
    @Test(description = "Test03_displyPassNote")
    @Description("this test verify the password sentence")
    public void Test03_displyPassNote()
    {
        Verifications.VerifyVisitableElement(grafana_Login.word_password);
    }
    @Test(description = "Test04_displyForgotLink")
    @Description("this test verify the link: forgot your password")
    public void Test04_displyForgotLink()
    {
        Verifications.VerifyVisitableElement(grafana_Login.link_forgotpassword);
    }
    @Test(description = "Test05_VerifyEnabledButton")
    @Description("this test verify the enable of login button")
    public void Test05_VerifyEnabledButton()
    {
        Verifications.VerifyEnableElement(grafana_Login.btn_login);
    }
    @Test (retryAnalyzer = utilities.RetryAnalyzer.class)
    @Description("this test verify the header of main page")
    public void Test06_verifyHeader()
    {
      GrafanaFlows.login("admin","admin");
      Verifications.VerifyTextInElement(grafana_MainPage.txt_mainTitle, "Welcome to Grafana");
    }
}
