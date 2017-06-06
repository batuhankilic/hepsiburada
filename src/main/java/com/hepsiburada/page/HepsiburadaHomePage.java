package com.hepsiburada.page;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HepsiburadaHomePage extends HepsiburadaBase{

    @Value("${testDomainBase}")
    private String testDomainBase;

    public void goTo() {
            webDriver.get(testDomainBase);
    }

}
