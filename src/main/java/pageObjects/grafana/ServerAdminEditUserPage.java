package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminEditUserPage {
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[1]/div/div[2]/div[1]/div[2]/button[1]")
    public WebElement btn_deleteUser;
    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/button")
    public WebElement btn_confirmDeleteUser;
}
