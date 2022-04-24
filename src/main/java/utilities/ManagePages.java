package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.grafana.ServerAdminAddNewUser;
import pageObjects.grafana.ServerAdminEditUserPage;
import pageObjects.grafana.ServerAdminLeftMenuPage;
import pageObjects.grafana.ServerAdminMainPage;

public class ManagePages extends Base {

    public static void initGrafana(){
        grafana_Login= PageFactory.initElements(driver,pageObjects.grafana.LoginPage.class);
        grafana_MainPage= PageFactory.initElements(driver,pageObjects.grafana.MainPage.class);
        grafana_LeftMenuPage=PageFactory.initElements(driver,pageObjects.grafana.LeftMenuPage.class);
       grafana_ServerAdminLeftMenuPage = PageFactory.initElements(driver, ServerAdminLeftMenuPage.class);
       grafana_ServerAdminMainPage=PageFactory.initElements(driver, ServerAdminMainPage.class);
       grafana_ServerAdminAddNewUser=PageFactory.initElements(driver, ServerAdminAddNewUser.class);
       grafana_ServerAdminEditUserPage=PageFactory.initElements(driver, ServerAdminEditUserPage.class);
    }
}
