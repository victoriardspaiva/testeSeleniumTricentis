package io.cucumber.victoria;

import io.cucumber.java.pt.*;
import io.cucumber.victoria.config.Settings;

public class PriceOption {

  @Quando("preencho o campo Select Option {string} e clico no botao next")
  public void preencho_o_campo_Select_Option_e_clico_no_botao_next(String string) throws InterruptedException {

    if (string.contains("Silver")) {
      Settings.seletorQueryCss("#priceTable>tfoot>tr>th.group>label:nth-child(1)").click();
    } else if (string.contains("Gold")) {
      Settings.seletorQueryCss("#priceTable>tfoot>tr>th.group>label:nth-child(2)").click();
    } else if (string.contains("Platinum")) {
      Settings.seletorQueryCss("#priceTable>tfoot>tr>th.group>label:nth-child(3)").click();
    } else if (string.contains("Ultimate")) {
      Settings.seletorQueryCss("#priceTable>tfoot>tr>th.group>label:nth-child(4)").click();
    }
    Thread.sleep(3000);
    Settings.seletorQueryCss("#nextsendquote").click();
  }
}
