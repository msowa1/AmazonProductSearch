package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    public WebElement buttonSearch;

    public void Search(String searchTxt){
        searchBox.sendKeys(searchTxt);
    }

    public void ClickSearch(){
        buttonSearch.click();
    }
}
