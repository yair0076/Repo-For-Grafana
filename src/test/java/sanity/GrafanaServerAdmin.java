package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.GrafanaFlows;


public class GrafanaServerAdmin extends CommonOps {

    @Test(description = "Test01_verifyDefaultUser")
    @Description("this test verify the default user row")
    public void Test01_verifyDefaultUser() {
        GrafanaFlows.login("admin", "admin");
        UIActions.mouseOver(grafana_LeftMenuPage.btn_server, grafana_ServerAdminLeftMenuPage.link_users);
        Verifications.VerifyNumOfElements(grafana_ServerAdminMainPage.rows, 2);
    }

    @Test(description = "Test02_VerifyNewUser")
    @Description("this test verify the new create user")
    public void Test02_VerifyNewUser() {
        GrafanaFlows.createNewUser("meir", "meir@gmail.com", "meir", "admin");
        Verifications.VerifyNumOfElements(grafana_ServerAdminMainPage.rows, 3);
    }

    @Test(description = "Test03_VerifyDeletionUser")
    @Description("this test verify the deletion of user")
    public void Test03_VerifyDeletionUser() {
        GrafanaFlows.login("admin", "admin");
        UIActions.mouseOver(grafana_LeftMenuPage.btn_server, grafana_ServerAdminLeftMenuPage.link_users);
        GrafanaFlows.deleteLastUser();
        Verifications.VerifyNumOfElements(grafana_ServerAdminMainPage.rows, 2);
    }

    @Test(description = "Test04_Search Users",dataProvider = "data-provider-users",dataProviderClass = utilities.ManageDDT.class)
    @Description("this test searched users in  a table using DDT")
    public void Test04_SearchUsers(String user,String shouldExist) {
        UIActions.mouseOver(grafana_LeftMenuPage.btn_server, grafana_ServerAdminLeftMenuPage.link_users);
        GrafanaFlows.searchAndVerifyUser(user, shouldExist);

    }
}
