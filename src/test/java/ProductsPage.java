import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    SelenideElement backPack = $(By.xpath("//*[@id=\"item_4_title_link\"]/div"));


    public void clickOnBackPack() {
        backPack.click();
    }


}
