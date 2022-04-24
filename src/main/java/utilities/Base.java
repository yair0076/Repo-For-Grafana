package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.grafana.LeftMenuPage;
import pageObjects.grafana.MainPage;
import pageObjects.grafana.ServerAdminLeftMenuPage;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;
    //page objects
    protected static pageObjects.grafana.LoginPage grafana_Login;
    protected static MainPage grafana_MainPage;
    protected static LeftMenuPage grafana_LeftMenuPage;
    protected static ServerAdminLeftMenuPage grafana_ServerAdminLeftMenuPage;
    protected static pageObjects.grafana.ServerAdminMainPage grafana_ServerAdminMainPage;
    protected static pageObjects.grafana.ServerAdminAddNewUser grafana_ServerAdminAddNewUser;
    protected static pageObjects.grafana.ServerAdminEditUserPage grafana_ServerAdminEditUserPage;

}
