package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminLeftMenuPage {

    @FindBy(how = How.XPATH,using = "//body/div[@id='reactRoot']/div[1]/nav[1]/div[3]/div[6]/ul[1]/li[2]/a[1]")
    public WebElement link_users;
    @FindBy(how = How.XPATH,using = "//body/div[@id='reactRoot']/div[1]/nav[1]/div[3]/div[6]/ul[1]/li[3]/a[1]")
    public WebElement link_orgs;
    @FindBy(how = How.XPATH,using = "//body/div[@id='reactRoot']/div[1]/nav[1]/div[3]/div[6]/ul[1]/li[4]/a[1]")
    public WebElement link_settings;
    @FindBy(how = How.XPATH,using = "//body/div[@id='reactRoot']/div[1]/nav[1]/div[3]/div[6]/ul[1]/li[5]/a[1]")
    public WebElement link_plugins;
    @FindBy(how = How.XPATH,using = "//body/div[@id='reactRoot']/div[1]/nav[1]/div[3]/div[6]/ul[1]/li[6]/a[1]")
    public WebElement link_licensing;



}
