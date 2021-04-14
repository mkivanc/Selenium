package com.toptal.webPages;

import com.toptal.utility.ConfigurationReader;
import com.toptal.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

        //Locators
       // WebDriver driver;
        //Apply as Developer Button
        @FindBy(linkText = "Apply as a Freelancer") //href attribute
        private WebElement developerApplyButton;

        //Constructor
        public HomePage(){
            String url=ConfigurationReader.get("url");
            Driver.driver.get(url);

            //Initialise Elements
            PageFactory.initElements(Driver.get(), this);
        }


        public void clickOnDeveloperApplyButton(){

            developerApplyButton.click();

        }
}

