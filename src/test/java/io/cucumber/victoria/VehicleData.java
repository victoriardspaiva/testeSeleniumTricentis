package io.cucumber.victoria;
import io.cucumber.java.pt.*;
import io.cucumber.victoria.config.Settings;

public class VehicleData {

    // @Dado("que estou na aba Enter Vehicle Data {string}")
    // public void que_estou_na_aba_Enter_Vehicle_Data(String string) {
    // String aba =
    // Settings.seletorQueryCss(".idealsteps-step-active").getAttribute("name");
    // assertEquals(aba, string);
    // }

    @Quando("preencho o campo Make {string}")
    public void preencho_o_campo_Make(String string) {
        Settings.seletorQueryCss("#make").sendKeys(string);
    }

    @Quando("preencho o campo Model {string}")
    public void preencho_o_campo_Model(String string) {
        Settings.seletorQueryCss("#model").sendKeys(string);
    }

    @Quando("preencho o campo Cylinder Capacity {string}")
    public void preencho_o_campo_Cylinder_Capacity_ccm(String string) {
        Settings.seletorQueryCss("#cylindercapacity").sendKeys(string);
    }

    @Quando("preencho o campo Engine Performance {string}")
    public void preencho_o_campo_Engine_Performance_kW(String string) {
        Settings.seletorQueryCss("#engineperformance").sendKeys(string);
    }

    @Quando("preencho o campo Date of Manufacture {string}")
    public void preencho_o_campo_Date_of_Manufacture(String string) {
        Settings.seletorQueryCss("#dateofmanufacture").sendKeys(string);
    }

    @Quando("preencho o campo Number of Seats1 {string}")
    public void preencho_o_campo_Number_of_Seats1(String string) {
        Settings.seletorQueryCss("#numberofseats").sendKeys(string);
    }

    @Quando("preencho o campo Right Hand Drive {string}")
    public void preencho_o_campo_Right_Hand_Drive(String string) {

         if (string.contains("Yes")) {
            Settings.seletorQueryCss(
                    "#insurance-form>div>section:nth-child(1)>div:nth-child(7)>p>label:nth-child(1)>span")
                    .click(); // foi no yes
        } else {
            Settings.seletorQueryCss(
                    "#insurance-form>div>section:nth-child(1)>div:nth-child(7)>p>label:nth-child(2)>span")
                    .click(); // foi no No
        }
    }

    @Quando("preencho o campo Number of Seats2 {string}")
    public void preencho_o_campo_Number_of_Seats2(String string) {
        Settings.seletorQueryCss("#numberofseatsmotorcycle").sendKeys(string);
    }

    @Quando("preencho o campo Fuel Type {string}")
    public void preencho_o_campo_Fuel_Type(String string) {
        Settings.seletorQueryCss("#fuel").sendKeys(string);
    }

    @Quando("preencho o campo Payload {string}")
    public void preencho_o_campo_Payload_kg(String string) {
        Settings.seletorQueryCss("#payload").sendKeys(string);
    }

    @Quando("preencho o campo Total Weight {string}")
    public void preencho_o_campo_Total_Weight_kg(String string) {
        Settings.seletorQueryCss("#totalweight").sendKeys(string);
    }

    @Quando("preencho o campo List Price {string}")
    public void preencho_o_campo_List_Price(String string) {
        Settings.seletorQueryCss("#listprice").sendKeys(string);
    }

    @Quando("preencho o campo License Plate Number {string}")
    public void preencho_o_campo_License_Plate_Number(String string) {
        Settings.seletorQueryCss("#licenseplatenumber").sendKeys(string);
    }

    @Quando("preencho o campo Annual Mileage {string} e clico no botao next")
    public void preencho_o_campo_Annual_Mileage_mi(String string) {
        Settings.seletorQueryCss("#annualmileage").sendKeys(string);
        Settings.seletorQueryCss("#nextenterinsurantdata").click();
    }

}
