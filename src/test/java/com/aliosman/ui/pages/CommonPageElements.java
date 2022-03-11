package com.aliosman.ui.pages;

import com.aliosman.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CommonPageElements {
    public CommonPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "sp-cc-accept")
    public WebElement acceptcookies;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchtxtbox;



    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement navUser;

    @FindBy(id = "searchDropdownBox")
    public WebElement searchDropdownBox;

    @FindBy(id = "nav-search-label-id")
    public WebElement searchNavLabel;

    @FindBy(partialLinkText = "Shopping List")
    public WebElement shoppingList;

    @FindBy(id = "nav-item-signout")
    public WebElement signOut;

    @FindBy(id = "nav-logo-sprites")
    public WebElement homePageLogo;

    @FindBy(id = "WLHUC_continue")
    public WebElement alisveriseDevamEtBtn;



}
