package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[6]")
    public WebElement btn_server;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[1]")
    public WebElement btn_create;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[2]")
    public WebElement btn_dashboards;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[3]")
    public WebElement btn_explore;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[4]")
    public WebElement btn_alerting;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/nav/div[3]/div[5]")
    public WebElement btn_configuration;

}
