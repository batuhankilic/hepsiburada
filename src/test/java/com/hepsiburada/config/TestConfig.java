package com.hepsiburada.config;

import com.google.common.collect.Lists;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TestConfig {

    @Value("${chromeDriverPath}")
    private String chromeDriverPath;

    @Value("${firefoxDriverPath}")
    private String firefoxDriverPath;

    @Value("${testDomainBase}")
    private String testDomainBase;

    public final static List<Dimension> DIMENSIONS = Lists.newArrayList(new Dimension(1300, 800),
        new Dimension(1100, 800), new Dimension(900, 800));

    @Bean
    public WebDriver webDriver() {
        FirefoxProfile prof = new FirefoxProfile();
        prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
        prof.setPreference("startup.homepage_welcome_url.additional",  "about:blank");
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        return new FirefoxDriver(prof);
    }

/*
    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }
*/

}
