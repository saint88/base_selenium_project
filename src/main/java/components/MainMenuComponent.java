package components;

import data.MainMenuItemsData;
import data.cources.ICourceData;
import data.cources.QACourceData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.CourcePage;

public class MainMenuComponent extends AbsBaseComponent {

  public MainMenuComponent(WebDriver driver) {
    super(driver);
  }

  private String mainMenuLocator = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='%s']]";
  private String subMenuLocator = mainMenuLocator + "//a[@title='%s']";

  public MainMenuComponent moveCursorToItem(MainMenuItemsData mainMenuItemsData) {
    String locator = String.format(mainMenuLocator, mainMenuItemsData.getName());

    WebElement mainMenu = driver.findElement(By.xpath(locator));
    actions.moveToElement(mainMenu).build().perform();

    return this;
  }

  public CourcePage clickCurseByName(ICourceData courceData) {
    String locator = String.format(subMenuLocator, MainMenuItemsData.Cources.getName(), courceData.getCourcesData().getName());
    WebElement subMenu = driver.findElement(By.xpath(locator));

    String copurceLocator = String.format(
        "//*[contains(@class, 'header2-menu__subdropdown-item')][contains(text(), '%s')]",
        courceData.getName()
    );

    actions
        .moveToElement(subMenu, 40, 0)
        .click(driver.findElements(By.xpath(copurceLocator)).get(1)).build().perform();

    return new CourcePage(driver);
  }
}
