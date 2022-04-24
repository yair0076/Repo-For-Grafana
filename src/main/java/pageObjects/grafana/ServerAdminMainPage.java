package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(how = How.XPATH,using = "tr[ng-repeat='user in ctrl.users']")
    public List<WebElement> rows;
    @FindBy(how = How.CLASS_NAME,using = "css-sqvqs4-button")
    public WebElement btn_user;
    @FindBy(how = How.CLASS_NAME,using = "css-fcoerl-input-input")
    public WebElement txt_search;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]")
    public WebElement link_userMail;

}
