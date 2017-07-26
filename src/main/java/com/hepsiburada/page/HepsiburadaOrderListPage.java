package com.hepsiburada.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HepsiburadaOrderListPage extends HepsiburadaBase{
    public void getOrderDetails() {
        List<WebElement> allOrders=findAllByXpath("//*[@class=\"OrderListContBG\"]");
        for ( WebElement order: allOrders) {
            String orderNo=order.findElement(By.xpath(".//*[@class=\"OrderNo\"]")).getText();
            System.out.println(orderNo);
            String orderPrice=order.findElement(By.xpath(".//*[@class=\"OrderTotal\"]")).getText();
            System.out.println(orderPrice);
            String orderDate=order.findElement(By.xpath(".//*[@class=\"OrderDate\"]")).getText();
            System.out.println(orderDate);
        }


    }
}
