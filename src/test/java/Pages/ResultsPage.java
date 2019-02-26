package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ResultsPage {

    public ResultsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "sort")
    public WebElement sortDropdown_1;

    @FindBy(how = How.ID, using = "s-result-sort-select")
    public WebElement sortDropdown_2;

    @FindBy(how = How.XPATH, using = "//li[@id='result_1']//a/h2")
    public WebElement selectProduct_1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search\"]//div[2]/div/div/div/div[2]/div[2]//div[1]//div[1]/h5/a")
    public WebElement selectProduct_2;

    public void SortById() {

        try {
            if(sortDropdown_1.isEnabled()){
                Select dropdown = new Select(sortDropdown_1);
                dropdown.selectByValue("price-desc-rank");
            }
        }
        catch (Exception e){
            Select dropdown = new Select(sortDropdown_2);
            dropdown.selectByValue("price-desc-rank");
        }
    }

    public void SelectSecondProduct(){
        try{
            if(selectProduct_1.isDisplayed()){
                selectProduct_1.click();
            }
        }
        catch (Exception e){
            selectProduct_2.click();
        }
    }
}



