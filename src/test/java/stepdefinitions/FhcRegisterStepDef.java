package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.FHCLoginPage;
import pages.FhcRegisterPage;
import sun.java2d.pipe.DrawImage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcRegisterStepDef {
    FHCLoginPage fhcLoginPage = new FHCLoginPage();
    FhcRegisterPage fhcRegisterPage=new FhcRegisterPage();

    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
        fhcLoginPage.createButton.click();

    }

    @Given("kullanici username girer")
    public void kullanici_username_girer() {
        fhcRegisterPage.username.sendKeys("Ayse");
    }

    @Given("kullanici password girer")
    public void kullanici_password_girer() {
        fhcRegisterPage.password.sendKeys("123123");
    }

    @Given("kullanici email girer")
    public void kullanici_email_girer() {
        fhcRegisterPage.mail.sendKeys("abc@gmail.com");
    }

    @Given("kullanici fullname girer")
    public void kullanici_fullname_girer() {
        fhcRegisterPage.fullname.sendKeys("ayse turh");
    }

    @Given("kullanici phone girer")
    public void kullanici_phone_girer() {
       fhcRegisterPage.phone.sendKeys("123123123");
    }

    @Given("kullanici SSN girer")
    public void kullanici_SSN_girer() {
        fhcRegisterPage.ssnumber.sendKeys("123-45-7896");
    }

    @Given("kullanici driving lisans girer")
    public void kullanici_driving_lisans_girer() {
        fhcRegisterPage.drivingLicense.sendKeys("111");
    }

    @Given("kullanici country dropdowndan secer")
    public void kullanici_country_dropdowndan_secer() {
        Select select = new Select(fhcRegisterPage.Country);
        select.selectByIndex(12);

    }

    @Given("kullanici state dropdowndan secer")
    public void kullanici_state_dropdowndan_secer() {
        Select select = new Select(fhcRegisterPage.state);
        select.selectByIndex(7);
    }

    @Given("kullanici adress girer")
    public void kullanici_adress_girer() {
        fhcRegisterPage.address.sendKeys("Athens");
    }

    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() {
       fhcRegisterPage.sector.sendKeys("IT egitim");
    }

    @Given("kullanici birthday girer")
    public void kullanici_birthday_girer() {
        fhcRegisterPage.birthdate.sendKeys("12.12.1978");
    }

    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();
    }

}
