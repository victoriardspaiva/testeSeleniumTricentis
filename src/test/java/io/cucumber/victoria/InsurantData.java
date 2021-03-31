package io.cucumber.victoria;

import org.openqa.selenium.By;
import io.cucumber.java.pt.*;
import io.cucumber.victoria.config.Settings;

public class InsurantData {

  @Quando("preencho o campo First Name {string}")
  public void preencho_o_campo_First_Name(String string) {
    Settings.seletorQueryCss("#firstname").sendKeys(string);
  }

  @Quando("preencho o campo Last Name {string}")
  public void preencho_o_campo_Last_Name(String string) {
    Settings.seletorQueryCss("#lastname").sendKeys(string);
  }

  @Quando("preencho o campo Date of Birth {string}")
  public void preencho_o_campo_Date_of_Birth(String string) {
    Settings.seletorQueryCss("#birthdate").sendKeys(string);
  }

  @Quando("preencho o campo Gender {string}")
  public void preencho_o_campo_Gender(String string) {

    if (string.contains("Male")) {
      Settings.seletorQueryCss("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(1)>span")
          .click();
    } else {
      Settings.seletorQueryCss("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(2)>span")
          .click();
    }
  }

  @Quando("preencho o campo Street Address {string}")
  public void preencho_o_campo_Street_Address(String string) {
    Settings.seletorQueryCss("#streetaddress").sendKeys(string);
  }

  @Quando("preencho o campo Country {string}")
  public void preencho_o_campo_Country(String string) {
    Settings.seletorQueryCss("#country").sendKeys(string);
  }

  @Quando("preencho o campo Zip Code {string}")
  public void preencho_o_campo_Zip_Code(String string) {
    Settings.seletorQueryCss("#zipcode").sendKeys(string);
  }

  @Quando("preencho o campo City {string}")
  public void preencho_o_campo_City(String string) {
    Settings.seletorQueryCss("#city").sendKeys(string);
  }

  @Quando("preencho o campo Occupation {string}")
  public void preencho_o_campo_Occupation(String string) {
    Settings.seletorQueryCss("#occupation").sendKeys(string);
  }

  @Quando("preencho o campo Hobbies {string}")
  public void preencho_o_campo_Hobbies(String string) {

    if (string.contains("Skydiving")) {
      Settings.seletorQueryCss(
          "#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)")
          .click();
    } else if (string.contains("Bungee Jumping")) {
      Settings.seletorQueryCss(
          "#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox.invalid>p>label:nth-child(2)")
          .click();
    } else if (string.contains("Cliff Diving")) {
      Settings.seletorQueryCss(
          "#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox.invalid>p>label:nth-child(3)")
          .click();
    } else if (string.contains("Skydiving")) {
      Settings.seletorQueryCss(
          "#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(4)")
          .click();
    } else if (string.contains("Other")) {
      Settings.seletorQueryCss(
          "#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(5)")
          .click();
    }
  }

  @Quando("preencho o campo Website {string}")
  public void preencho_o_campo_Website(String string) {
    Settings.seletorQueryCss("#website").sendKeys(string);
  }

  @Quando("preencho o campo Picture \\/pasta\\/foto e clico no botao next")
  public void preencho_o_campo_Picture_pasta_foto() {
    // Settings.seletorQueryCss("#open").click();
    Settings.seletorQueryCss("#open").sendKeys("img:\\img.jpg");
    Settings.seletorQueryCss("#nextenterproductdata").click();
  }
}