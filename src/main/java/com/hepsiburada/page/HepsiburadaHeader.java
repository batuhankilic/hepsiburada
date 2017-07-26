package com.hepsiburada.page;

import com.google.common.base.Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HepsiburadaHeader extends HepsiburadaBase {

    @Value("${testDomainBase}")
    private String testDomainBase;

    @Value("${siparislerimPathForAnonymousUser}")
    private String siparislerimPathForAnonymousUser;

    @Value("${gununFirsatlariPath}")
    private String gununFirsatlariPath;

    @Value("${hediyeCeklerimPath}")
    private String hediyeCeklerimPath;

    @Value("${tekTiklaAlisverisPath}")
    private String tekTiklaAlisverisPath;

    @Value("${kampanyalarPath}")
    private String kampanyalarPath;

    @Value("${girisimciKadinlarPath}")
    private String girisimciKadinlarPath;

    @Value("${bizeSorunPath}")
    private String bizeSorunPath;

    @Value("${myAccountHoverLogInPath}")
    private String myAccountHoverLogInPath;

    @Value("${myAccountHoverRegisterPath}")
    private String myAccountHoverRegisterPath;

    @Value("${myAccountHoverSiparislerimPath}")
    private String myAccountHoverSiparislerimPath;

    @Value("${myAccountHoverHesabimPath}")
    private String myAccountHoverHesabimPath;

    @Value("${myAccountHoverListelerimPath}")
    private String myAccountHoverListelerimPath;

    @Value("${myAccountHoverFirsatlarimPath}")
    private String myAccountHoverFirsatlarimPath;

    @Value("${myAccountHoverHediyeCeklerimPath}")
    private String myAccountHoverHediyeCeklerimPath;

    @Value("${myAccountHoverMesajlarimPath}")
    private String myAccountHoverMesajlarimPath;

    @Value("${myCartPath}")
    private String myCartPath;


    @Value("${headerLogoXpath}")
    private String headerLogoXpath;

    @Value("${headerSiparislerimXpath}")
    private String headerSiparislerimXpath;

    @Value("${headerGununFirsatlariXpath}")
    private String headerGununFirsatlariXpath;

    @Value("${headerHediyeCeklerimXpath}")
    private String headerHediyeCeklerimXpath;

    @Value("${headerTekTiklaAlisverisXpath}")
    private String headerTekTiklaAlisverisXpath;

    @Value("${headerKampanyalarXpath}")
    private String headerKampanyalarXpath;

    @Value("${headerGirisimciKadinlarXpath}")
    private String headerGirisimciKadinlarXpath;

    @Value("${headerBizeSorunXpath}")
    private String headerBizeSorunXpath;

    @Value("${headerSearchBarCampaignTextXpath}")
    private String headerSearchBarCampaignTextXpath;

    @Value("${headerSearchButtonXpath}")
    private String headerSearchButtonXpath;

    @Value("${headerSearchTextBoxXpath}")
    private String headerSearchTextBoxXpath;

    @Value("${listingPageSearchKeywordXpath}")
    private String listingPageSearchKeywordXpath;

    @Value("${headerAutocompleteBrandsXpath}")
    private String headerAutocompleteBrandsXpath;

    @Value("${headerAutocompleteMerchantsXpath}")
    private String headerAutocompleteMerchantsXpath;

    @Value("${headerAutocompleteCategoriesXpath}")
    private String headerAutocompleteCategoriesXpath;

    @Value("${listingPageNoResultImageXpath}")
    private String listingPageNoResultImageXpath;

    @Value("${listingPageCategoryTitle}")
    private String listingPageCategoryTitle;

    @Value("${breadcrumb1stLevel}")
    private String breadcrumb1stLevel;

    @Value("${breadcrumb2ndLevel}")
    private String breadcrumb2ndLevel;

    @Value("${breadcrumb3rdLevel}")
    private String breadcrumb3rdLevel;

    @Value("${headerMyAccountButtonXpath}")
    private String headerMyAccountButtonXpath;

    @Value("${headerMyAccountHoverLogInXpath}")
    private String headerMyAccountHoverLogInXpath;

    @Value("${headerMyAccountHoverRegisterXpath}")
    private String headerMyAccountHoverRegisterXpath;

    @Value("${headerMyAccountHoverSiparislerimXpath}")
    private String headerMyAccountHoverSiparislerimXpath;

    @Value("${headerMyAccountHoverHesabimXpath}")
    private String headerMyAccountHoverHesabimXpath;

    @Value("${headerMyAccountHoverListelerimXpath}")
    private String headerMyAccountHoverListelerimXpath;

    @Value("${headerMyAccountHoverFirsatlarimXpath}")
    private String headerMyAccountHoverFirsatlarimXpath;

    @Value("${headerMyAccountHoverHediyeCeklerimXpath}")
    private String headerMyAccountHoverHediyeCeklerimXpath;

    @Value("${headerMyAccountHoverMesajlarimXpath}")
    private String headerMyAccountHoverMesajlarimXpath;

    @Value("${headerCartButtonXpath}")
    private String headerCartButtonXpath;



    public void clickLogo() {

        LOGGER.info("TEST STARTED: testGoToHomePageViaLogo");
        clickByXpath(headerLogoXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().equals(testDomainBase));
            LOGGER.info("PASSED: testGoToHomePageViaLogo");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToHomePageViaLogo");
            throw (e);
        }
    }

    public void clickSiparislerim() {

        LOGGER.info("TEST STARTED: testGoToSiparislerimViaHeader");

        closeNotificationPopUp();
        clickByXpath(headerSiparislerimXpath);

    /*    try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(siparislerimPathForAnonymousUser));
            LOGGER.info("PASSED: testGoToSiparislerimViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToSiparislerimViaHeader");
            throw (e);
        }
        */
    }

    public void clickGununFirsatlari() {

        LOGGER.info("TEST STARTED: testGoToGununFirsatlariViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerGununFirsatlariXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(gununFirsatlariPath));
            LOGGER.info("PASSED: testGoToGununFirsatlariViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToGununFirsatlariViaHeader");
            throw (e);
        }
    }

    public void clickHediyeCeklerim() {

        LOGGER.info("TEST STARTED: testGoToHediyeCeklerimViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerHediyeCeklerimXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(hediyeCeklerimPath));
            LOGGER.info("PASSED: testGoToHediyeCeklerimViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToHediyeCeklerimViaHeader");
            throw (e);
        }
    }

    public void clickTekTiklaAlisveris() {

        LOGGER.info("TEST STARTED: testGoToTekTiklaAlisverisViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerTekTiklaAlisverisXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(tekTiklaAlisverisPath));
            LOGGER.info("PASSED: testGoToTekTiklaAlisverisViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToTekTiklaAlisverisViaHeader");
            throw (e);
        }
    }

    public void clickKampanyalar() {

        LOGGER.info("TEST STARTED: testGoToTKampanyalarViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerKampanyalarXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(kampanyalarPath));
            LOGGER.info("PASSED: testGoToTKampanyalarViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToTKampanyalarViaHeader");
            throw (e);
        }
    }

    public void clickGirisimciKadinlar() {

        LOGGER.info("TEST STARTED: testGoToTGirisimciKadinlarViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerGirisimciKadinlarXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(girisimciKadinlarPath));
            LOGGER.info("PASSED: testGoToTGirisimciKadinlarViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToTGirisimciKadinlarViaHeader");
            throw (e);
        }
    }

    public void clickBizeSorun() {

        LOGGER.info("TEST STARTED: testGoToBizeSorunViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerBizeSorunXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(bizeSorunPath));
            LOGGER.info("PASSED: testGoToBizeSorunViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToBizeSorunViaHeader");
            throw (e);
        }
    }

    public void checkCampaignTextInSearchBar(){
        LOGGER.info("TEST STARTED: checkCampaignTextInSearchBar");
        closeNotificationPopUp();
        try {
            Preconditions.checkState(!webDriver.findElement(By.xpath(headerSearchBarCampaignTextXpath)).getText().isEmpty());
            LOGGER.info("PASSED: checkCampaignTextInSearchBar");
        } catch (Exception e) {
            LOGGER.error("FAILED: checkCampaignTextInSearchBar");
            throw (e);
        }
    }

    public void goToCampaignPageViaSearchButton(){
        LOGGER.info("TEST STARTED: goToCampaignPageViaSearchButton");
        closeNotificationPopUp();
        String campaignUrl=webDriver.findElement(By.xpath(headerSearchBarCampaignTextXpath)).getAttribute("data-href");
        clickByXpath(headerSearchButtonXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().equals(campaignUrl));
            LOGGER.info("PASSED: goToCampaignPageViaSearchButton");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToCampaignPageViaSearchButton");
            throw (e);
        }
    }

    public void searchKeyword(String keyWord){
        LOGGER.info("TEST STARTED: searchKeyword");
        closeNotificationPopUp();
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        clickByXpath(headerSearchButtonXpath);
        untilWaitElementPresence(listingPageSearchKeywordXpath);
        try {
            Preconditions.checkState(webDriver.findElement(By.xpath(listingPageSearchKeywordXpath)).getText().contains(keyWord)
                || exists(listingPageNoResultImageXpath));
            LOGGER.info("PASSED: searchKeyword");
        } catch (Exception e) {
            LOGGER.error("FAILED: searchKeyword");
            throw (e);
        }
    }

    public void checkAutoComplete(String keyWord){
        LOGGER.info("TEST STARTED: checkAutoComplete");
        closeNotificationPopUp();
        clearTextBoxByXpath(headerSearchTextBoxXpath);
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        untilWaitElementPresence("//*[@class=\"autocomplete-suggestions\"]/div");
        List<WebElement> autoCompleteList = findAllByXpath("//*[@class=\"autocomplete-suggestions\"]/div");
        try {
            for (int i = 0; i < autoCompleteList.size(); i++) {
                Preconditions.checkState(autoCompleteList.get(i).getText().toLowerCase().contains(keyWord)||
                    autoCompleteList.get(i).getText().contains("İlgili Markalar")||
                    autoCompleteList.get(i).getText().contains("Kategoriler")||
                    autoCompleteList.get(i).getText().contains("İlgili Kelimeler")||
                    autoCompleteList.get(i).getText().contains("Satıcılar"));
            }
            LOGGER.info("PASSED: checkAutoComplete");
        } catch (Exception e) {
            LOGGER.error("FAILED: checkAutoComplete");
            throw (e);
        }
    }

    public void goToBrandListingViaAutoComplete(String keyWord){
        LOGGER.info("TEST STARTED: goToBrandListingViaAutoComplete");
        closeNotificationPopUp();
        clearTextBoxByXpath(headerSearchTextBoxXpath);
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        untilWaitElementPresence(headerAutocompleteBrandsXpath);
        WebElement randomAutocompleteBrand = findRandomByXpath(headerAutocompleteBrandsXpath);
        String selectedBrand= randomAutocompleteBrand.getText();
        randomAutocompleteBrand.click();
        try {
            Preconditions.checkState(webDriver.findElement(By.xpath(breadcrumb2ndLevel)).getText().contains("Markalar")
                &&webDriver.findElement(By.xpath(breadcrumb3rdLevel)).getText().contains(selectedBrand));
            LOGGER.info("PASSED: goToBrandListingViaAutoComplete");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToBrandListingViaAutoComplete");
            throw (e);
        }
    }

    public void goToCategoryListingViaAutoComplete(String keyWord){
        LOGGER.info("TEST STARTED: goToCategoryListingViaAutoComplete");
        closeNotificationPopUp();
        clearTextBoxByXpath(headerSearchTextBoxXpath);
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        untilWaitElementPresence(headerAutocompleteCategoriesXpath);
        WebElement randomAutocompleteCategory = findRandomByXpathFirst3(headerAutocompleteCategoriesXpath);
        String selectedCategory= randomAutocompleteCategory.getText();
        randomAutocompleteCategory.click();
        untilWaitElementPresence(listingPageCategoryTitle);
        try {
            Preconditions.checkState(exists(listingPageCategoryTitle));
            LOGGER.info("Selected Category:{}",selectedCategory);
            LOGGER.info("Category Listing Page:{}",webDriver.findElement(By.xpath(listingPageCategoryTitle)).getText());
            LOGGER.info("PASSED: goToCategoryListingViaAutoComplete");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToCategoryListingViaAutoComplete");
            throw (e);
        }
    }

    public void goToRelatedWordsViaAutoComplete(String keyWord){
        LOGGER.info("TEST STARTED: goToRelatedWordsViaAutoComplete");
        closeNotificationPopUp();
        clearTextBoxByXpath(headerSearchTextBoxXpath);
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        untilWaitElementPresence(headerAutocompleteCategoriesXpath);
        WebElement randomAutocompleteRelatedWord = findRandomByXpathLast3(headerAutocompleteCategoriesXpath);
        String selectedRelatedWord= randomAutocompleteRelatedWord.getText();
        randomAutocompleteRelatedWord.click();
        untilWaitElementPresence(listingPageSearchKeywordXpath);
        try {
            Preconditions.checkState(webDriver.findElement(By.xpath(listingPageSearchKeywordXpath)).getText().contains(selectedRelatedWord));
            LOGGER.info("PASSED: goToRelatedWordsViaAutoComplete");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToRelatedWordsViaAutoComplete");
            throw (e);
        }
    }

    public void goToMerchantListingViaAutoComplete(String keyWord){
        LOGGER.info("TEST STARTED: goToMerchantListingViaAutoComplete");
        closeNotificationPopUp();
        clearTextBoxByXpath(headerSearchTextBoxXpath);
        sendKeysByXpath(headerSearchTextBoxXpath,keyWord);
        untilWaitElementPresence(headerAutocompleteMerchantsXpath);
        WebElement randomAutocompleteMerchant = findRandomByXpath(headerAutocompleteMerchantsXpath);
        String selectedBrand= randomAutocompleteMerchant.getText();
        randomAutocompleteMerchant.click();
        try {
            Preconditions.checkState(webDriver.findElement(By.xpath(breadcrumb2ndLevel)).getText().contains("Mağazalar")
                &&webDriver.findElement(By.xpath(breadcrumb3rdLevel)).getText().contains(selectedBrand));
            LOGGER.info("PASSED: goToMerchantListingViaAutoComplete");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToMerchantListingViaAutoComplete");
            throw (e);
        }
    }

    public void goToLogInViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToLogInViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverLogInXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverLogInXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverLogInPath));
            LOGGER.info("PASSED: goToLogInViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToLogInViaMyAccountHover");
            throw (e);
        }
    }

    public void goToRegisterViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToRegisterViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverRegisterXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverRegisterXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverRegisterPath));
            LOGGER.info("PASSED: goToRegisterViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToRegisterViaMyAccountHover");
            throw (e);
        }
    }

    public void goToSiparislerimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToSiparislerimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverSiparislerimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverSiparislerimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverSiparislerimPath));
            LOGGER.info("PASSED: goToSiparislerimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToSiparislerimViaMyAccountHover");
            throw (e);
        }
    }

    public void goToHesabimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToHesabimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverHesabimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverHesabimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverHesabimPath));
            LOGGER.info("PASSED: goToHesabimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToHesabimViaMyAccountHover");
            throw (e);
        }
    }

    public void goToListelerimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToListelerimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverListelerimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverListelerimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverListelerimPath));
            LOGGER.info("PASSED: goToListelerimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToListelerimViaMyAccountHover");
            throw (e);
        }
    }

    public void goToFirsatlarimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToFirsatlarimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverFirsatlarimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverFirsatlarimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverFirsatlarimPath));
            LOGGER.info("PASSED: goToFirsatlarimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToFirsatlarimViaMyAccountHover");
            throw (e);
        }
    }

    public void goToHediyeCeklerimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToHediyeCeklerimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverHediyeCeklerimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverHediyeCeklerimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverHediyeCeklerimPath));
            LOGGER.info("PASSED: goToHediyeCeklerimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToHediyeCeklerimViaMyAccountHover");
            throw (e);
        }
    }

    public void goToMesajlarimViaMyAccountHover(){
        LOGGER.info("TEST STARTED: goToMesajlarimViaMyAccountHover");
        closeNotificationPopUp();
        hoverOnWebElement(webDriver.findElement(By.xpath(headerMyAccountButtonXpath)));
        untilWaitElementPresence(headerMyAccountHoverMesajlarimXpath);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(headerMyAccountHoverMesajlarimXpath);
        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myAccountHoverMesajlarimPath));
            LOGGER.info("PASSED: goToMesajlarimViaMyAccountHover");
        } catch (Exception e) {
            LOGGER.error("FAILED: goToMesajlarimViaMyAccountHover");
            throw (e);
        }
    }

    public void clickCartButton() {

        LOGGER.info("TEST STARTED: testGoToMyCartViaHeader");
        closeNotificationPopUp();
        clickByXpath(headerCartButtonXpath);

        try {
            Preconditions.checkState(webDriver.getCurrentUrl().contains(myCartPath));
            LOGGER.info("PASSED: testGoToMyCartViaHeader");
        } catch (Exception e) {
            LOGGER.error("FAILED: testGoToMyCartViaHeader");
            throw (e);
        }
    }


}
