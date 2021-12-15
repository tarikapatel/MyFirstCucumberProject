package org.example;

        import io.cucumber.java.After;
        import io.cucumber.java.Before;
        import io.cucumber.java.Scenario;
        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Utils {

    BrowserManager browserManager = new BrowserManager();

    @Before
    public void setBrowser(){
        browserManager.openBrowser();
    }

    @After
    public void tearDownBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "My screenshot"); //stick it in the report
        }
        browserManager.closeBrowser();
    }

}