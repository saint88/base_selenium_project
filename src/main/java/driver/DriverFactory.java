package driver;

import driver.impl.ChromeWebDriver;
import exceptions.DriverNotSupportedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class DriverFactory implements IDriverFactory {

  private String browserType = System.getProperty("browser").toLowerCase();

  @Override
  public WebDriver getDriver() throws DriverNotSupportedException {
    switch (this.browserType) {
      case "chrome": {
        return new ChromeWebDriver().newDriver();
      }
      default:
        throw new DriverNotSupportedException(this.browserType);
    }
  }
}
