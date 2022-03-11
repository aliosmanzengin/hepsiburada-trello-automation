package com.aliosman.ui.pages;

import com.aliosman.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {
    public SearchResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(className = "a-color-state a-text-bold")
//    public WebElement searchResult;

    @FindBy(xpath = "//span[@class='s-pagination-strip']//a")
    public List<WebElement> paginationList;

    @FindBy(xpath = "//span[@aria-current='page']")
    public WebElement paginationSelected;

    @FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']//span[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS-')]")
    public List<WebElement> searchResultList;


    @FindBy(id = "p_72/1248879011")
    public WebElement fourStarsAndUp;



}
