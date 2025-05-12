package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.Flow_1Page;

public class Flow1_Test extends BaseClass {
	private Flow_1Page flow1Page;
	private String toSearch = "wireless mouse";
	private String expectedMsg = "Added to Cart";
	private String expectedQuantity = "2";
	private String expectedSubtotal = "$23.98";

	@Test(priority = 1)
	public void test_Flow() {
		flow1Page = new Flow_1Page(driver, wait);
		try {
            flow1Page.clickSkipCapcha();
        } catch (Exception e) {
            // Ignore if CAPTCHA is not present
        }
		flow1Page.searchProduct(toSearch);
		flow1Page.selectProduct();
	}

	@Test(priority = 2, dependsOnMethods = "test_Flow")
	public void test_AddtoCart() {
		flow1Page.addToCart();
		String msg = flow1Page.getAddToCartMessage();
		Assert.assertEquals(msg, expectedMsg, "Add to Cart message mismatch");
		driver.navigate().back();
		flow1Page.selectProduct();
		flow1Page.addToCart();
	}

	@Test(priority = 3, dependsOnMethods = "test_AddtoCart")
	public void test_GoToCart() {
		flow1Page.goToCart();
		String val = flow1Page.getCartQuantity();
		Assert.assertEquals(val, expectedQuantity, "Cart quantity mismatch");
		String subtotalText = flow1Page.getSubtotal();
		Assert.assertTrue(subtotalText.contains(expectedSubtotal), "Subtotal mismatch");
	}

}
