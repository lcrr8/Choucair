package co.com.choucair.certification.finalproject.stepdefinitions;

import co.com.choucair.certification.finalproject.tasks.CheckQuality;
import co.com.choucair.certification.finalproject.tasks.OpenBrowser;
import co.com.choucair.certification.finalproject.tasks.Go;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FinalProjectStepsDefinitions
{
    @Given("^That (.*) wants to evaluate the quality on the jobs section of the Choucair website$")
    public void thatUserWantsToEvaluateTheQualityOnTheJobsSectionOfTheChoucairWebsite(String actor)
    {
        theActorCalled(actor).wasAbleTo(OpenBrowser.onTheHomePageOfThechoucairWebSite());
    }


    @When("^The User enters and checks the sections like ¿What is it to be Choucair\\? Announcements, and Prepare to apply$")
    public void theUserEntersAndChecksTheSectionsLikeWhatIsItToBeChoucairAnnouncementsAndPrepareToApply()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Go.theJobsSection(),
                CheckQuality.severalSectionsOfThePage());
    }

    @Then("^The User gets the information corresponding to each section like$")
    public void theUserGetsTheInformationCorrespondingToEachSectionLike(DataTable arg1)
    {
    }

    @Given("^That User wants to search a job and insert the data$")
    public void thatUserWantsToSearchAJobAndInsertTheData()
    {
    }

    @When("^The User searches a job and registers the data in the required fields$")
    public void theUserSearchesAJobAndRegistersTheDataInTheRequiredFields(DataTable arg1)
    {
    }

    @Then("^The User can see the send button but doesn't do it$")
    public void theUserCanSeeTheSendButtonButDoesnTDoIt(DataTable arg1)
    {
    }
}
