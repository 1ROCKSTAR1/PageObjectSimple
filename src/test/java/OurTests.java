import org.junit.Test;

public class OurTests extends Basic {

    private final static String BASE_URL = "https://www.saucedemo.com";
    private final static String log = "standard_user";
    private final static String pas = "secret_sauce";

    @Test
    public void checkCourse() throws InterruptedException {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.enterLogin(log);
        Thread.sleep(1000);
        mainPage.enterPassword(pas);
        Thread.sleep(1000);
        mainPage.clickSubmit();

    }

    @Test
    public void addBackPack() throws InterruptedException {
        ProductsPage productsPage = new ProductsPage();
        Thread.sleep(1000);
        productsPage.clickOnBackPack();
    }
}