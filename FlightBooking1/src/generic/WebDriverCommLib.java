package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WebDriverCommLib extends BaseTest{
	
	public void getPageTitle(String pageName)
	{
		String title = driver.getTitle();
		Reporter.log("The Title of the page"+pageName+"is"+title);
	}
	
	public void verifyPageTitle(String pageName,String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle))
		{
			Reporter.log("The Title of the page"+pageName+"is matched",true);
		}
		
		else
		{
			Reporter.log("The Title of the page"+pageName+"is not matched",true);
		}
		
	}
	
	public void selectOptionsFromDropdown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOptionsFromDropdown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOptionsFromDropdown(String visibleText,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	
	public void deselectOptionsFromDropdown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	
	public void deselectOptionsFromDropdown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	
	public void deselectOptionsFromDropdown(String visibleText,WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(visibleText);
	}

	public void deselectOptionsFromDropdown(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
	
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	
	public void mouseHouver(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}
	
	public void dragAndDrop(WebElement src,WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
	}
	
	public void printAllOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		
		for (WebElement webElement : allOps) {
			String text = webElement.getText();
			Reporter.log("The following are the options of dropdown"+text,true);		
		}
	}
	
	public void dropDownType(WebElement element)
	{
		Select sel = new Select(element);
		boolean result = sel.isMultiple();
		
		if (result==true)
		{
			Reporter.log("Is Multiselect Dropdown",true);
		}
		else
		{
			Reporter.log("Is Singleselect Dropdown",true);
		}
	}
	
	public void handleFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handleFrame(String idOrName)
	{
		driver.switchTo().frame(idOrName);
	}
	
	public void handleFrame(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void enterButton() throws AWTException
	{
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void copy() throws AWTException 
	{
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void paste() throws AWTException 
	{
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void scrollUp(int pixels)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixels+")");
	}
	
	public void scrollDown(int pixels)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(-pixels)+")");
	}
	
	public void scrollLeft(int pixels)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(-pixels)+",0)");
	}
	
	public void scrollRight(int pixels)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+pixels+",0)");
	}
	
	public void scrollTillElement(WebElement element)
	{
		Point loc = element.getLocation();
		int xloc = loc.getX();
		int yloc = loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xloc+","+yloc+")");	
	}
	
	public void acceptAlert()
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void dismissJavaScriptPopup()
	{
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	
	public void removeNotificationPopup()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifiactions");
	}
	
	public void wait(int sec) throws InterruptedException
	{
		Thread.sleep(sec);
	}
}
