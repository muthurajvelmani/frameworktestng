package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFb extends BaseClass {
public LoginFb() {
	PageFactory.initElements(driver, this);
}
@FindBy(name="email")
private WebElement username;
@FindBy(name="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;
public WebElement getlogin() {
	return login;
}
public WebElement getpassword() {
	return password;
}

public WebElement getUsername() {
	return username;
}













}
