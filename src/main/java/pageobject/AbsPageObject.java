package pageobject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public abstract class AbsPageObject {

  protected WebDriver driver;
  protected Actions actions;

  public AbsPageObject(WebDriver driver) {
    this.driver = driver;
    this.actions = new Actions(driver);

    PageFactory.initElements(driver, this);
  }

  @FindBy(tagName = "h1")
  private WebElement header;

  public void pageHeaderShouldBeSameAs(String header) {
    Assertions.assertEquals(
        header,
        this.header.getText(),
        String.format("Header should be %s", header));
  }

}
