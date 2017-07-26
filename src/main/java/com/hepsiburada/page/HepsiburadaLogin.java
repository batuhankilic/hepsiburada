package com.hepsiburada.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HepsiburadaLogin extends HepsiburadaBase{
    @Value("${testDomainBase}")
    private String testDomainBase;

    public void logIn() {
        WebElement email = webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement password = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement logInButton = webDriver.findElement(By.xpath("//*[@class=\"btn full btn-login-submit\"]"));

        email.sendKeys("eren.sar@hepsiburada.com");
        password.sendKeys("RHRwp700");
        logInButton.click();
    }

}
