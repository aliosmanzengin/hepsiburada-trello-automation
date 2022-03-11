package com.aliosman.ui.pages;

import com.aliosman.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "ap_email")
    public WebElement email;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(xpath = "//span[@class='a-list-item']")
    public WebElement alertMessage;
}
