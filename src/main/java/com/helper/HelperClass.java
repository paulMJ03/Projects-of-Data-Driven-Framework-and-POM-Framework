package com.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.Result;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Alert al;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void toText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void size(WebElement element) {
		element.getSize();

	}

	public static void printText(WebElement element) {
		String text1 = element.getText();
		System.out.println(text1);
	}

	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void convertToString(WebElement element) {
		String string = element.toString();
		System.out.println(string);

	}

	public static void performMoveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void toDragAndDrop(WebElement source, WebElement target) {
		a.dragAndDrop(source, target).perform();

	}

	public static void doubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public static void rightClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public static void toPerformEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toTakeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("E:\\Selenium\\sample1.png");
		FileHandler.copy(f1, f2);
	}

	public static void toScroll(WebElement element1, WebElement element2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element1);
		js.executeScript("arguments[0].scrollIntoView(false)", element2);

	}

	public static void toAcceptAlerts() {
		Alert al = driver.switchTo().alert();
		String string1 = al.toString();
		System.out.println(string1);
		al.accept();

	}

	public static void toDismissAlert() {
		Alert al = driver.switchTo().alert();
		String string2 = al.toString();
		System.out.println(string2);
		al.dismiss();
	}

	public static void toGetAllOptionsInDropdown(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement1 : options) {
			System.out.println(webElement1.getText());
		}

	}

	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement2 : allSelectedOptions) {
			System.out.println(webElement2.getText());
		}
	}

	public static void selectByIndex(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void selectByVisibleText(String text3, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text3);

	}

	public static void selectByValue(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void switchWindow() {
		String parentWindw = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			if (!(eachWindow).equals(parentWindw)) {
				driver.switchTo().window(eachWindow);
			}
		}

	}

	public static void switchFrameByIndex(String index) {
		driver.switchTo().frame(index);

	}

	public static void switchFrameByStringId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public static void switchFrameByWebelementRef(String frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public static String excelRead(String fileLocation,int rowNo, int cellNo, String sheet) throws IOException {
		File f=new File(fileLocation);
		FileInputStream f1=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(f1);
		Sheet s=book.getSheet(sheet);
			
			Row row = s.getRow(rowNo);
			
				Cell cell = row.getCell(cellNo);
				int cellType = cell.getCellType();
				String name="";
				if (cellType==1) {
					name = cell.getStringCellValue();
					System.out.println(name);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					System.out.println(dateCellValue);
					SimpleDateFormat sim=new SimpleDateFormat("DD/MM/YYYY");
					String format = sim.format(dateCellValue);
					System.out.println(format);
				}else {
					double d = cell.getNumericCellValue();
					System.out.println(d);
					long l=(long)d;//typecasting
					name = String.valueOf(l);
					System.out.println(name);	
					
				}
				return name;
				
			}
			public static void getDateAndTime() {
				Date d=new Date();
				System.out.println(d);

			}
			public static void getResult() {
				Result r=new Result();
				System.out.println("RUN TIME: "+r.getRunTime());
				System.out.println("RUN COUNT: "+r.getRunCount());
				System.out.println("FAIL COUNT: "+r.getFailureCount());
				System.out.println("IGNORE COUNT: "+r.getIgnoreCount());

			}


	}


