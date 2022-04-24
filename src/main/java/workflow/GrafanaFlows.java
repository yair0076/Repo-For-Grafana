package workflow;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class GrafanaFlows extends CommonOps {


    @Step("Business flow: login")
    public static void login(String user,String pass)  {
        UIActions.updateText(grafana_Login.txt_username, user);
        UIActions.updateText(grafana_Login.txt_password, pass);
        UIActions.click(grafana_Login.btn_login);
        UIActions.click(grafana_Login.btn_skip);
    }
    @Step("Business flow: create new user")
    public static void createNewUser(String Name,String Email,String userName,String pass)
    {
        UIActions.click(grafana_ServerAdminMainPage.btn_user);
        UIActions.updateText(grafana_ServerAdminAddNewUser.txt_name, Name);
        UIActions.updateText(grafana_ServerAdminAddNewUser.txt_username, userName);
        UIActions.updateText(grafana_ServerAdminAddNewUser.txt_email, Email);
        UIActions.updateText(grafana_ServerAdminAddNewUser.txt_password, pass);
        UIActions.click(grafana_ServerAdminAddNewUser.btn_create);
    }
    @Step("Business flow: delete last user")
    public static void deleteLastUser()
    {
        //UIActions.click(grafana_ServerAdminMainPage.rows.get(grafana_ServerAdminMainPage.rows.size()-1));
        UIActions.click(grafana_ServerAdminMainPage.link_userMail);
        UIActions.click(grafana_ServerAdminEditUserPage.btn_deleteUser);
        UIActions.click(grafana_ServerAdminEditUserPage.btn_confirmDeleteUser);

    }
    @Step("Business flow: search and verify user")
    public static void searchAndVerifyUser(String user,String shouldExist)  {
        UIActions.updateTextHuman(grafana_ServerAdminMainPage.txt_search,user);
        if (shouldExist.equalsIgnoreCase("exists"))
            Verifications.existanceOfElement(grafana_ServerAdminMainPage.rows);
        else if (shouldExist.equalsIgnoreCase("not-exists"))
            Verifications.nonExistanceOfElement(grafana_ServerAdminMainPage.rows);
        else throw new RuntimeException("Invalid Expected Output in Data Driven Testing");

    }
}
