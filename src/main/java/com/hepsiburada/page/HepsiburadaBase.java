package com.hepsiburada.page;


import com.google.common.collect.Lists;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public abstract class HepsiburadaBase {

    protected static final Logger LOGGER = LoggerFactory.getLogger(HepsiburadaBase.class);
    protected static final Random RANDOM = new Random();

    @Autowired
    protected WebDriver webDriver;

    @Value("${notificationPopUpLaterButtonXpath}")
    private String notificationPopUpLaterButtonXpath;

    protected WebElement findByCss(String css) {
        WebElement el = webDriver.findElement(By.cssSelector(css));

        highlightElement(el);

        return el;
    }

    protected List<WebElement> findAllByXpath(String xpath) {
        return webDriver.findElements(By.xpath(xpath));
    }

    protected void highlightElement(WebElement el) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", el,
            "color: red; border: 3px solid red;");
    }

    protected void clickByText(String text) {
        findByCss(text).click();
    }

    protected void clickRandomByXpath(String xpath) {
        List<WebElement> elements = findAllByXpath(xpath);
        elements.get(RANDOM.nextInt(elements.size())).click();
    }

    protected void clickByXpath(String xpath) {

        WebElement el = webDriver.findElement(By.xpath(xpath));
        el.click();
    }

    public WebElement findRandomByXpath(String xpath) {
        List<WebElement> elements = findAllByXpath(xpath);
        if (elements.size() != 0) {
            return elements.get(RANDOM.nextInt(elements.size()));
        } else {
            LOGGER.error("findRandomByXpath metodunda verilen xpath ile hiç bir eleman bulunamadı");
            LOGGER.error("Aranan xpath: " + xpath);
            LOGGER.error("Hatanın meydana geldiği sayfa:" + webDriver.getCurrentUrl());
            throw new IllegalArgumentException();
        }
    }

    public WebElement findRandomByXpathFirst3(String xpath) {
        List<WebElement> elements = findAllByXpath(xpath);
        if (elements.size() != 0) {
            return elements.get(RANDOM.nextInt(3));
        } else {
            LOGGER.error("findRandomByXpath metodunda verilen xpath ile hiç bir eleman bulunamadı");
            LOGGER.error("Aranan xpath: " + xpath);
            LOGGER.error("Hatanın meydana geldiği sayfa:" + webDriver.getCurrentUrl());
            throw new IllegalArgumentException();
        }
    }

    public WebElement findRandomByXpathLast3(String xpath) {
        List<WebElement> elements = findAllByXpath(xpath);
        if (elements.size() != 0) {
            return elements.get(RANDOM.nextInt(3)+3);
        } else {
            LOGGER.error("findRandomByXpath metodunda verilen xpath ile hiç bir eleman bulunamadı");
            LOGGER.error("Aranan xpath: " + xpath);
            LOGGER.error("Hatanın meydana geldiği sayfa:" + webDriver.getCurrentUrl());
            throw new IllegalArgumentException();
        }
    }

    public boolean exists(String xpath) {
        List<WebElement> elements = findAllByXpath(xpath);

        return !elements.isEmpty();
    }

    public void focusOnNewTab(WebDriver driver) {
        List<String> tabs = Lists.newArrayList(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
    }

    public void focusOnOldTab(WebDriver driver) {
        List<String> tabs = Lists.newArrayList(driver.getWindowHandles());

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void setWindowSize(Dimension dim) {
        webDriver.manage().window().setSize(dim);
    }

    public void scrollDownSmooth(int pixel) {
        for (int i = 0; i < pixel; i++) {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,1)", "");
        }
    }

    public void removeWebElementByClassNameWithJs(String className) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("$(\"." + className + "\").remove()");
    }

    public void hoverOnWebElement(WebElement webElement) {
        Actions action = new Actions(webDriver);
        action.moveToElement(webElement).build().perform();
    }

    protected WebElement untilWaitElementPresence(String xpath){
        WebDriverWait wait=new WebDriverWait(webDriver, 10);;
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return el;//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(htmlText)));
    }

    public void closeNotificationPopUp(){
        Boolean isPresent = webDriver.findElements(By.xpath(notificationPopUpLaterButtonXpath)).size() > 0;
        if(isPresent){
            clickByXpath(notificationPopUpLaterButtonXpath);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendKeysByXpath(String headerSearchTextBoxXpath, String keyWord){
        webDriver.findElement(By.xpath(headerSearchTextBoxXpath)).sendKeys(keyWord);
    }

    public void clearTextBoxByXpath(String headerSearchTextBoxXpath){
        webDriver.findElement(By.xpath(headerSearchTextBoxXpath)).clear();
    }

}
