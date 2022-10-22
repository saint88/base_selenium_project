package main.menu;

import components.MainMenuComponent;
import data.MainMenuItemsData;
import data.cources.QACourceData;
import driver.DriverFactory;
import exceptions.DriverNotSupportedException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class MainMenu_Test {

  private WebDriver driver;

  @BeforeEach
  public void init() throws DriverNotSupportedException {
    this.driver = new DriverFactory().getDriver();
  }

  @AfterEach
  public void close() {
    if(this.driver != null) {
      this.driver.close();
      this.driver.quit();
    }
  }

  @Test
  public void testMainMenuClickCourseItem() {
    new MainPage(driver)
        .open("/");

    new MainMenuComponent(driver)
        .moveCursorToItem(MainMenuItemsData.Cources)
        .clickCurseByName(QACourceData.QALead)
        .pageHeaderShouldBeSameAs(QACourceData.QALead.getName());
  }

}
