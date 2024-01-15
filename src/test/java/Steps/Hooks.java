package Steps;

import Utilies.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hooks {
    @Before
    public static void setUp() {
        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown(@NotNull Scenario scenario) {
        //validate if scenario has failed
        if(scenario.isFailed()){
            try {
                Path dest = Paths.get("./Screenshots",scenario.getName()+"-"+scenario.getId()+".png");
                Files.createDirectories(dest.getParent());
                FileOutputStream out = new FileOutputStream(dest.toString());
                final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
                out.write(screenshot);
                out.close();
                scenario.attach(screenshot, "image/png", scenario.getName()+scenario.getId());
            } catch (IOException e) {
                System.out.println("Excpetion while taking screenshot"+ e.getMessage());
            }
        }
        HelperClass.tearDown();
    }
}
