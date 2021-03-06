package com.toptal.webPages;

import com.toptal.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeveloperPortalPage {


    @FindBy(xpath = "/html/body/div[1]/div/div/header/div/h1")
    private WebElement heading;

    @FindBy(linkText = "JOIN TOPTAL")
    private WebElement joinToptalButton;

    //Constructor
    public DeveloperPortalPage (){

        //Initialise Elements
        PageFactory.initElements(Driver.get(), this);
    }

    //We will use this boolean for assertion. To check if page is opened
    public boolean isPageOpened(){
        return heading.getText().toString().contains("Developer portal");
    }

    public void clikOnJoin(){
        joinToptalButton.click();
    }


}
