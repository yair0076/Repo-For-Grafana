package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how = How.CLASS_NAME,using = "css-1aanzv4")
    public WebElement txt_mainTitle;
    @FindBy(how = How.XPATH,using = "//*[@id=\"reactRoot\"]/div/main/div[3]/header/div")
    public List<WebElement> list_toolBar;

}
