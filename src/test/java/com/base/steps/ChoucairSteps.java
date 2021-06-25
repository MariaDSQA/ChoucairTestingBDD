package com.base.steps;

import static org.junit.Assert.assertNotNull;
import com.base.pageobject.ChoucairPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChoucairSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChoucairSteps.class);

    private ChoucairPage page;



    public void abrirPagina(){
        LOGGER.info("abrir aplicativo Choucair page");
        page.open();
    }



    public void ingresarUsuario(String userName){
        LOGGER.info("ingresar usuario");
        page.txtUserName.waitUntilVisible();
        page.txtUserName.type(userName);
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }

    public void ingresarPassword(String password){
        LOGGER.info("ingresar password");
        page.txtPassword.waitUntilVisible();
        page.txtPassword.type(password);
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }

    public void clickenLoginButton(){
        LOGGER.info("se dio click en el login button");
        page.btnLogin.waitUntilVisible();
        page.btnLogin.click();

    }

    public void verificarUserHome(){
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException e){}
        page.close.waitUntilVisible();
        LOGGER.info("se puede ver el home del aplicativo");
        assertNotNull(page.close);
    }

    public void validaMensajeError(){
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException e){}
        page.error.waitUntilVisible();
        LOGGER.info("se puede ver el mensaje de error");
        assertNotNull(page.error);
    }

}
