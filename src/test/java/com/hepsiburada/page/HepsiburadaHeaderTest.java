package com.hepsiburada.page;

import com.hepsiburada.ApplicationTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationTest.class)
@FixMethodOrder(MethodSorters.DEFAULT)
public class HepsiburadaHeaderTest {

    @Autowired
    private WebDriver webDriver;

    @Autowired
    private HepsiburadaHomePage homePage;

    @Autowired
    private HepsiburadaHeader header;

    @Autowired
    private HepsiburadaLogin login;

    @Autowired
    private HepsiburadaOrderListPage orderListPage;

    @Test
    public void getOrderDetails(){
        homePage.goTo();
        header.clickSiparislerim();
        login.logIn();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        orderListPage.getOrderDetails();
        System.out.println("Change Host!");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*changeHost*/
        webDriver.navigate().refresh();
        orderListPage.getOrderDetails();

    }


    @Test
    public void testGoToHomePageViaLogo() {
        homePage.goTo();
        header.clickLogo();
    }

    @Test
    public void testGoToSiparislerimViaHeader() {
        homePage.goTo();
        header.clickSiparislerim();
    }

    @Test
    public void testGoToGununFirsatlariViaHeader() {
        homePage.goTo();
        header.clickGununFirsatlari();
    }

    @Test
    public void testGoToHediyeCeklerimViaHeader() {
        homePage.goTo();
        header.clickHediyeCeklerim();
    }

    @Test
    public void testGoToTekTiklaAlisverisViaHeader() {
        homePage.goTo();
        header.clickTekTiklaAlisveris();
    }

    @Test
    public void testGoToKampanyalarViaHeader() {
        homePage.goTo();
        header.clickKampanyalar();
    }

    @Test
    public void testGoToGirisimciKadinlarViaHeader() {
        homePage.goTo();
        header.clickGirisimciKadinlar();
    }

    @Test
    public void testGoToBizeSorunViaHeader() {
        homePage.goTo();
        header.clickBizeSorun();
    }

    @Test
    public void testSearchBarCampaigns(){
        homePage.goTo();
        header.checkCampaignTextInSearchBar();
        header.goToCampaignPageViaSearchButton();
    }

    @Test
    public void testSearchFunctions(){
        homePage.goTo();
        header.searchKeyword("beyaz");
        header.checkAutoComplete("beyaz");
    }

    @Test
    public void testSearchAutoComplete(){
        homePage.goTo();
        header.checkAutoComplete("beyaz");
        header.goToBrandListingViaAutoComplete("beyaz");
        header.goToCategoryListingViaAutoComplete("beyaz");
        header.goToRelatedWordsViaAutoComplete("beyaz");
        header.goToMerchantListingViaAutoComplete("beyaz");
    }


    @Test
    public void testGoToLogInViaMyAccountHover(){
        homePage.goTo();
        header.goToLogInViaMyAccountHover();
    }

    @Test
    public void testGoToRegisterViaMyAccountHover(){
        homePage.goTo();
        header.goToRegisterViaMyAccountHover();
    }

    @Test
    public void testGoToSiparisleriViaMyAccountHover(){
        homePage.goTo();
        header.goToSiparislerimViaMyAccountHover();
    }

    @Test
    public void testGoToHesabimViaMyAccountHover(){
        homePage.goTo();
        header.goToHesabimViaMyAccountHover();
    }

    @Test
    public void testGoToListelerimViaMyAccountHover(){
        homePage.goTo();
        header.goToListelerimViaMyAccountHover();
    }

    @Test
    public void testGoToFirsatlarimViaMyAccountHover(){
        homePage.goTo();
        header.goToFirsatlarimViaMyAccountHover();
    }

    @Test
    public void testGoToHediyeCeklerimViaMyAccountHover(){
        homePage.goTo();
        header.goToHediyeCeklerimViaMyAccountHover();
    }

    @Test
    public void testGoToMesajlarimViaMyAccountHover(){
        homePage.goTo();
        header.goToMesajlarimViaMyAccountHover();
    }

    @Test
    public void testGoToMyCartViaHeader(){
        homePage.goTo();
        header.clickCartButton();
    }



}
