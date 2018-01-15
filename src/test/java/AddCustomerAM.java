import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerAM {

    @FindBy(xpath = "//*[@id='inner:incl:supplier_search_panel_grid_id']//button")
    private WebElement supplierButton;

    public AddCustomerAM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void SearchSupplier() {
        supplierButton.click();
        return;
    }
}
