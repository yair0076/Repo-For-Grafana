package extentions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("verify element  if is displayed")
    public static void VerifyVisitableElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }
    @Step("verify element  if is enabled")
    public static void VerifyEnableElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isEnabled());
    }
    @Step("verify element  if is selected")
    public static void VerifySelectedElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isSelected());
    }
    @Step("verify element in element")
    public static void VerifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
    @Step("verify the size of element//list ")
    public static void VerifyNumOfElements(List<WebElement> elems, int excepted) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), excepted);
    }
    @Step("verify element displayed//soft assertions//list")
    public static void VerifyVisibilityOfElements(List<WebElement> elems) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "sorry" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("some elements were not displayed");
    }
    @Step("verify element displayed ")
    public static void existanceOfElement(List<WebElement> elements) {
        assertTrue(elements.size()>0);
    }
    @Step("verify element not displayed ")
    public static void nonExistanceOfElement(List<WebElement> elements) {
        assertFalse(elements.size()>0);
    }
    @Step("verify element displayed according expected number ")
    public static void existanceOfElement(List<WebElement> elements,int expectedNumber) {
        assertTrue(elements.size()==expectedNumber);
    }



}
