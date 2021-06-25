package com.base.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.magneto365.com/es/candidates/sign-in")
public class ChoucairPage extends PageObject {
    @FindBy(id="emailSignIn")
    public WebElementFacade txtUserName;

    @FindBy(id="emailSignInConfirm")
    public WebElementFacade txtPassword;

    @FindBy(id="btnSubmitLogin")
    public WebElementFacade btnLogin;

    @FindBy(className="close")
    public WebElementFacade close;

    @FindBy(id="messageValidateexistEmail")
    public WebElementFacade error;

}
