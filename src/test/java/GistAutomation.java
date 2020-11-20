import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GistAutomation {
    @Steps
    GistAutomationStep gistAutomationStep;

    @Given("login as registered github user")
    public void givenLoginAsRegisteredGithubUser(){
        gistAutomationStep.LoginAsRegisteredGithubUser();
    }

    @When("I create new public gist")
    public void whenICreateNewPublicGist()throws InterruptedException{
        gistAutomationStep.ICreateNewPublicGist();
    }

    @Then("I get new public gist on my list")
    public void thenIGetNewPublicGistOnMyList(){
        gistAutomationStep.IGetNewPublicGistOnMyList();
    }

    @When("I edit file name of gist")
    public void whenIEditFileNameOfGist(){
        gistAutomationStep.EditGist();
    }

    @Then("I get updated file name of gist")
    public void thenIgetUpdatedFileName(){
        gistAutomationStep.GetUpdatedGist();
    }
}
