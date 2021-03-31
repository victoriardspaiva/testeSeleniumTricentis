package io.cucumber.victoria;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.victoria.config.Settings;

public class SendQuote {

  @Quando("preencho o campo E-Mail {string}")
  public void preencho_o_campo_E_Mail(String string) {
    Settings.seletorQueryCss("#email").sendKeys(string);
  }

  @Quando("preencho o campo Phone {string}")
  public void preencho_o_campo_Phone(String string) {
    Settings.seletorQueryCss("#phone").sendKeys(string);
  }

  @Quando("preencho o campo Username {string}")
  public void preencho_o_campo_Username(String string) {
    Settings.seletorQueryCss("#username").sendKeys(string);
  }

  @Quando("preencho o campo Password {string}")
  public void preencho_o_campo_Password(String string) {
    Settings.seletorQueryCss("#password").sendKeys(string);
  }

  @Quando("preencho o campo Confirm Password {string}")
  public void preencho_o_campo_Confirm_Password(String string) {
    Settings.seletorQueryCss("#confirmpassword").sendKeys(string);
  }

  @Quando("preencho o campo Comments {string}")
  public void preencho_o_campo_Comments(String string) {
    Settings.seletorQueryCss("#Comments").sendKeys(string);
  }

  @Quando("clico no botao Send")
  public void clico_no_botao_Send() {
    Settings.seletorQueryCss("#sendemail").click();
  }

  @Entao("verifico a mensagem {string}")
  public void verifico_a_mensagem(String string) throws InterruptedException {
    Thread.sleep(10000);
    String sucess = Settings.seletorQueryCss("body>div.sweet-alert.showSweetAlert.visible>h2").getText();
    assertEquals(sucess, string);
    Settings.seletorQueryCss("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button").click();
    Thread.sleep(1000);
    Settings.fechar();
  }
}
