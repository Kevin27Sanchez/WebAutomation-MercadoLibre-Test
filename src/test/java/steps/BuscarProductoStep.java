package steps;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BuscarProductoPage;

public class BuscarProductoStep {

    BuscarProductoPage buscarPage;

    @Given("estoy en la página principal de Mercado Libre")
    public void ingresarPaginaMercadoLibre() {
        Hooks.driver.get("https://www.mercadolibre.com.pe/");
        buscarPage = new BuscarProductoPage(Hooks.driver);
    }

    @When("busco el producto {string}")
    public void buscarProducto(String producto) {

    }

    @And("doy click en el botón de búsqueda")
    public void clickBotonBusqueda() {

    }

    @Then("debería visualizar resultados relacionados con {string}")
    public void visualizarResultadoBusqueda(String producto) {

    }
}
