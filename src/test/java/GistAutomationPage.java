import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GistAutomationPage extends PageObject {
    String username = System.getenv("username_github");
    String password = System.getenv("password_github");
    public void openGithub(){
        getDriver().navigate().to("https://github.com/");
    }
    public void Login(){
        getDriver().findElement(By.xpath("//a[@href='/login']")).click();
        getDriver().findElement(By.id("login_field")).sendKeys(username);
        getDriver().findElement(By.id("password")).sendKeys(password);
        getDriver().findElement(By.xpath("//input[@value='Sign in']")).click();
    }
    public void CreateNewPublicGist()throws InterruptedException{
        getDriver().findElement(By.xpath("//summary[@aria-label='View profile and more' and @role='button']")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.linkText("Your gists")).click();
        Thread.sleep(4000);
        getDriver().findElement(By.linkText("Create a gist")).click();
        getDriver().findElement(By.xpath("//input[@name='gist[contents][][name]']")).sendKeys("new_gist");
        getDriver().findElement(By.className("CodeMirror-lines")).click();
        Thread.sleep(3000);
//        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='gist[contents][][value]' and @placeholder='Enter file contents here']")));
        getDriver().findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]")).sendKeys("test");
        getDriver().findElement(By.xpath("//summary[@aria-haspopup='menu' and @role='button']")).click();
        getDriver().findElement(By.xpath("(//label[@class='select-menu-item'])[position()=2]")).click();
        getDriver().findElement(By.linkText("Create pubic gist")).click();
    }

    public void GetNewPublicGistOnMyList(){
        Assert.assertTrue(getDriver().findElement(By.id("file-new_gist")).isDisplayed());
    }

    public void EditGist(){
        getDriver().findElement(By.xpath("//strong[text()='new_gist']")).click();
        getDriver().findElement(By.xpath("//a[@aria-label='Edit this Gist']")).click();
        getDriver().findElement(By.xpath("//input[@name='gist[contents][][name]']")).sendKeys("ss");
        getDriver().findElement(By.linkText("Update public gist")).click();
    }

    public void GetUpdatedGist(){
        Assert.assertTrue(getDriver().findElement(By.id("file-new_gistss")).isDisplayed());
    }
}
