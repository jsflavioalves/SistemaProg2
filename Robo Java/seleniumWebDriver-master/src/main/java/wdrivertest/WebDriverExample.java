package wdrivertest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class show how to use selenium web driver
 * https://github.com/julianommartins/seleniumWebDriver
 * @author julianom
 *
 */
public class WebDriverExample  {
    public static void main(String[] args) {
		// If you want to load a existing profile
		// Option 1
		// ProfilesIni profile = new ProfilesIni();
		// FirefoxProfile julianoProf = profile.getProfile("default");
		// FirefoxOptions options = new FirefoxOptions().setProfile(julianoProf);
		//
		// Option 2
		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", true);
		// capabilities.setCapability(FirefoxDriver.PROFILE, julianoProf);
    	
    	// you need to download geckodriver (https://github.com/mozilla/geckodriver/releases)
    	// and extract to your machine (this example is for Linux, if you 
    	// are using windows, change to your local folder and add the .exe extension
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		
		// option 1 to use existing profile
		//WebDriver driver = new FirefoxDriver(options);
		// option 2 to use existing profile
		//WebDriver driver = new FirefoxDriver(capabilities);
		
		WebDriver driver = new FirefoxDriver();

        // Opening Google
        //driver.get("http://www.google.com");
		driver.get("https://si3.ufc.br/sigrh/login.jsf");
        driver.manage().window().maximize();

        // q its the search box name/ID
//        WebElement element = driver.findElement(By.name("q"));
        WebElement element = driver.findElement(By.id("login"));
        
        // Searching for José Flávio Vasconcelos Alves
        // element.sendKeys("José Flávio Vasconcelos Alves");
       element.sendKeys("jsflavio");
        
        WebElement element2 = driver.findElement(By.id("senha"));
        element2.sendKeys("fla12345");
        
        WebElement element3 = driver.findElement(By.id("logar"));
        element3.click();
        
        WebElement element4 = driver.findElement(By.id("selecionarUnidadeForm:mes"));
        List<WebElement> options = element4.findElements(By.tagName("option"));
        options.get(2).click();
        
        // Submit the form
       WebElement button = driver.findElement(By.name("selecionarUnidadeForm:j_id_jsp_89680184_284"));
       button.click();

        // Printing the page title - just for example
        System.out.println("Page title is: " + driver.getTitle());

		// If you want to Close the browser, uncomment this line
		// driver.quit();
    }
}
