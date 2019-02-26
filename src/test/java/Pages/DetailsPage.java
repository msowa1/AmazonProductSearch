package Pages;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

    public DetailsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "productTitle")
    public WebElement title;

    public void prodTitle(String arg0){

        Assert.assertTrue(title.getText().contains(arg0));
    }



}
