package io.cucumber.victoria;

import io.cucumber.java.pt.*;
import io.cucumber.victoria.config.Settings;

public class ProductData {

  @Quando("preencho o campo Start Date {string}")
public void preencho_o_campo_Start_Date(String string) {
  Settings.seletorQueryCss("#startdate").sendKeys(string);
}

@Quando("preencho o campo Insurance Sum {string}")
public void preencho_o_campo_Insurance_Sum(String string) {
  Settings.seletorQueryCss("#insurancesum").sendKeys(string);
}

@Quando("preencho o campo Merit Rating {string}")
public void preencho_o_campo_Merit_Rating(String string) {
  Settings.seletorQueryCss("#meritrating").sendKeys(string);
}

@Quando("preencho o campo Damage Insurance {string}")
public void preencho_o_campo_Damage_Insurance(String string) {
  Settings.seletorQueryCss("#damageinsurance").sendKeys(string);
}

@Quando("preencho o campo Optional Products {string}")
public void preencho_o_campo_Optional_Products(String string) {
  
  if (string.contains("Euro Protection")) {
    Settings.seletorQueryCss("#insurance-form>div>section:nth-child(3)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)")
    .click();
  } else if (string.contains("Legal Defense Insurance")) {
    Settings.seletorQueryCss("#insurance-form>div>section:nth-child(3)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(2)")
    .click();
  }
}

@Quando("preencho o campo Courtesy Car {string} e clico no botao next")
public void preencho_o_campo_Courtesy_Car_e_clico_no_botao_next(String string) {
  Settings.seletorQueryCss("#courtesycar").sendKeys(string);
  Settings.seletorQueryCss("#nextselectpriceoption").click();
}
  
}
