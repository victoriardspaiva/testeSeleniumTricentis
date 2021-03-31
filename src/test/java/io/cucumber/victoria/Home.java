package io.cucumber.victoria;

import io.cucumber.victoria.config.Settings;
import io.cucumber.java.pt.*;

public class Home {

  @Dado("que estou no site da Tricentis")
  public static void siteTricentis() {
    Settings.abrir("http://sampleapp.tricentis.com/101/app.php");
      
  }
}
