package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.CLASS_NAME,using = "css-vxdt2o")
    public WebElement title_login;
    @FindBy(how = How.CLASS_NAME,using = "css-xhqy0o")
    public WebElement word_emailorusername;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[2]/div/div/form/div[2]/div[1]/label/div")
    public WebElement word_password;
    @FindBy(how = How.NAME,using = "user")
    public WebElement txt_username;
    @FindBy(how = How.ID,using = "current-password")
    public WebElement txt_password;
    @FindBy(how = How.CLASS_NAME,using = "css-dwc7us")
    public WebElement txterror_username;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[2]/div")
    public WebElement txterror_password;
    @FindBy(how = How.CLASS_NAME,using = "css-19d6anp")
    public WebElement btn_showpassword;
    @FindBy(how = How.CLASS_NAME,using = "css-3coq9d-button")
    public WebElement btn_login;
    @FindBy(how = How.LINK_TEXT,using = "Forgot your password?")
    public WebElement link_forgotpassword;
    @FindBy(how = How.CLASS_NAME,using = "css-1mhnkuh")
    public WebElement btn_submit;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div[2]/div/form/div[3]/div[2]/button/span")
    public WebElement btn_skip;



}
