package Steps;

import Base.BaseUtils;
import Pages.DetailsPage;
import Pages.ResultsPage;
import Pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep extends BaseUtils {

    private BaseUtils base;

    public SearchStep(BaseUtils base) {
        this.base = base;
    }

    @Given("^User is on Amazon homepage$")
    public void userIsOnAmazonHomepage() throws Throwable{

        base.driver.get(Hook.pageUrl);
    }

    @When("^He search for \"([^\"]*)\"$")
    public void heSearchFor(String arg0) throws Throwable{

        SearchPage search = new SearchPage(base.driver);

        search.Search(arg0);
        search.ClickSearch();
    }

    @And("^Sort results from highest price to lowest$")
    public void sortResultsFromHighestPriceToLowest() throws Throwable{

        ResultsPage result = new ResultsPage(base.driver);

        result.SortById();
    }

    @Then("^He select second product and click it for details$")
    public void heSelectSecondProductAndClickItForDetails() throws Throwable{

        ResultsPage result = new ResultsPage(base.driver);

        result.SelectSecondProduct();
    }

    @And("^From page details check that product topic contains text “(.*)”$")
    public void fromPageDetailsCheckThatProductTopicContainsTextNikonDX(String arg0)throws Throwable{

        DetailsPage details = new DetailsPage(base.driver);

        details.prodTitle(arg0);
    }
}

