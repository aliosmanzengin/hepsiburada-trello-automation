package com.aliosman.ui.pages;

import com.aliosman.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WhishlistPage {
    public WhishlistPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@role='heading']")
    public WebElement listHeading;
//delete-button-I3PPS5SP5AL6R3-announce
////input[contains(@name,'deleteItem')]
    @FindBy(xpath = "//input[@name='submit.deleteItem']")
    public List<WebElement> kaldırBtnList;


}
