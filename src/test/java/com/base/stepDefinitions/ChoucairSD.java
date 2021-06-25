package com.base.stepDefinitions;

import com.base.steps.ChoucairSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChoucairSD {
    @Steps
    ChoucairSteps choucairSteps;


    @Given("El usuario abre la aplicacion Choucair")
    public void el_usuario_abre_la_aplicacion_choucair() {

        System.out.println("PASO");
        choucairSteps.abrirPagina();
        System.out.println("PASO2");
    }



    @When("El usuario ingresa su correo electronico {string} en el campo correo")
    public void el_usuario_ingresa_su_userName_en_el_campo_userName(String userName) {
        choucairSteps.ingresarUsuario(userName);

    }

    @When("EL usuario ingresa su password {string} en el campo password")
    public void el_usuario_ingresa_su_password_en_el_campo_password(String password) {
        choucairSteps.ingresarPassword(password);
    }

    @When("El usuario presionar click en el login button Choucair")
    public void el_usuario_presionar_click_en_el_login_button() {

        choucairSteps.clickenLoginButton();
    }

    @Then("puede ver home del aplicativo Choucair")
    public void puede_ver_home_del_aplicativo() {

        choucairSteps.verificarUserHome();
    }

    @Then("Valida mensaje de error")
    public void valida_mensaje_de_error() {

        choucairSteps.validaMensajeError();
    }

}
