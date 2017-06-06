package com.hepsiburada.config;

import com.google.common.collect.Lists;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TestConfig {

    @Value("${chromeDriverPath}")
    private String chromeDriverPath;

    @Value("${testDomainBase}")
    private String testDomainBase;

    public final static List<Dimension> DIMENSIONS = Lists.newArrayList(new Dimension(1300, 800),
        new Dimension(1100, 800), new Dimension(900, 800));

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }


}
