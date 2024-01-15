package Definitions;

import Pages.Header;
import Pages.HomePage;
import Pages.RegisterPage;
import Utilies.HelperClass;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class RegisterDefinitions {

    private final Header header = new Header();
    private final RegisterPage registerPage = new RegisterPage();
    public String expectedSuccessfulRegistrationMessage = "Your registration completed";
    public String expectedExistEmailMessage = "The specified email already exists";
    public String expectedConfirmPasswordErrorMessage = "The password and confirmation password do not match.";
    public void goToHomePage() {
        HelperClass.openPage("https://demo.nopcommerce.com/");
    }
    public void goToRegistrationPage() {
        header.goToRegisterPage();
    }
    public void register(DataTable dataTable) {
        List<Map<String,String>> usersData = dataTable.asMaps(String.class, String.class);
        Map<String,String> data = usersData.get(0);
        registerPage.enterFirstname(data.get("firstname"));
        registerPage.enterLastname(data.get("lastname"));
        registerPage.enterEmail(data.get("email"));
        registerPage.enterPassword(data.get("password"));
        registerPage.enterConfirmPassword(data.get("confirmPassword"));
        registerPage.selectGender(data.get("gender"));
        registerPage.enterCompanyName(data.get("companyName"));
        registerPage.selectDay(data.get("day"));
        registerPage.selectMonth(data.get("month"));
        registerPage.selectYear(data.get("year"));
        registerPage.register();
    }
    public String getActualSuccessfulRegistrationMessage(){
        return registerPage.getActualSuccessfulRegistrationMessage();
    }
    public String getActualExistEmailMessage(){
        return registerPage.getActualExistEmailMessage();
    }
    public String getActualConfirmPasswordErrorMessage(){
        return registerPage.getActualConfirmPasswordMessage();
    }
}
