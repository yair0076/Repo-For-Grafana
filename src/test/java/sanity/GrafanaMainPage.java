package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaFlows;

public class GrafanaMainPage extends CommonOps {

    @Test(description = "Test01_verifyToolBar")
    @Description("this test verify the tool bar menu//use soft assertions")
    public void Test01_verifyToolBar()
    {
        GrafanaFlows.login("admin","admin");
        Verifications.VerifyVisibilityOfElements(grafana_MainPage.list_toolBar);
    }

}
