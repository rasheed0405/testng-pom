package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flow_1Page {
	private WebDriverWait wait;

	public Flow_1Page(WebDriver driver, WebDriverWait wait) {
		PageFactory.initElements(driver, this);
		this.wait = wait;
	}

	// Locators
	@FindBy(xpath = "//a[@onclick='window.location.reload()']")
	WebElement skipCapcha;

	@FindBy(xpath = "//input[@name='field-keywords']")
	WebElement searchBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement clickSearch;

	@FindBy(xpath = "(//span[text()='Amazon Basics 2.4 Ghz Wireless Optical Computer Mouse with USB Nano Receiver, Black'])[1]")
	WebElement product;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;

	@FindBy(xpath = "//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	WebElement msgx;

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement cart;

	@FindBy(xpath = "//span[@data-a-selector='value']")
	WebElement value;

	@FindBy(xpath = "//span[text()='$23.98'])[1]")
	WebElement subTotal;

	String toSearch = "wireless mouse";
	String actval = "2";

	// Actioms
	
	public void clickSkipCapcha() {
        wait.until(ExpectedConditions.elementToBeClickable(skipCapcha)).click();
    }

	public void searchProduct(String query) {
		searchBox.sendKeys(query);
		clickSearch.click();
	}

	public void selectProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(product)).click();
	}

	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
	}

	public String getAddToCartMessage() {
		return wait.until(ExpectedConditions.visibilityOf(msgx)).getText();
	}

	public void goToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
	}

	public String getCartQuantity() {
		return wait.until(ExpectedConditions.visibilityOf(value)).getText();
	}

	public String getSubtotal() {
		return subTotal.getText();
	}
}
