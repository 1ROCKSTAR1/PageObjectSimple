import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BackPackPage {
    SelenideElement addToCart = $(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));

    public void clickOnAdd() {
        addToCart.click();
    }
}
