import net.thucydides.core.steps.ScenarioSteps;

public class GistAutomationStep extends ScenarioSteps {
    GistAutomationPage gistAutomationPage;

    public void LoginAsRegisteredGithubUser(){
        gistAutomationPage.openGithub();
        gistAutomationPage.Login();
    }

    public void ICreateNewPublicGist()throws InterruptedException{
        gistAutomationPage.CreateNewPublicGist();
    }

    public void IGetNewPublicGistOnMyList(){
        gistAutomationPage.GetNewPublicGistOnMyList();
    }

    public void EditGist(){
        gistAutomationPage.EditGist();
    }

    public void GetUpdatedGist(){
        gistAutomationPage.GetUpdatedGist();
    }
}
