package pages;

import org.openqa.selenium.By;
public class HomePage extends  BasePage {
    private static final By singupLoginBtn  = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    private static final By singupName = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    private static final By singupEmail = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private static final By singupBtn = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    private static final  By loginEmail = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div.login-form > form > input[type=email]:nth-child(2)");
    private static final By loginSenha = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div.login-form > form > input[type=password]:nth-child(3)");
    private static final By loginBtn = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div.login-form > form > button");


    private static final By mrBtn = By.cssSelector("#id_gender1");
    private static final By senhaForm = By.cssSelector("#password");
    private static final By dateDayForm = By.cssSelector("#days > option:nth-child(8)");
    private static final By dateMonthForm = By.cssSelector("#months > option:nth-child(5)");
    private static final By dateYearForm = By.cssSelector("#years > option:nth-child(23)");
    private static final By firstNameForm = By.cssSelector("#first_name");
    private static final By lastNameForm = By.cssSelector("#last_name");
    private static final By companyForm = By.cssSelector("#company");
    private static final By addressForm = By.cssSelector("#address1");
    private static final By countryForm = By.cssSelector("#country > option:nth-child(3)");
    private static final By stateForm = By.cssSelector("#state");
    private static final By cityForm = By.cssSelector("#city");
    private static final By zipForm = By.cssSelector("#zipcode");
    private static final By phoneForm = By.cssSelector("#mobile_number");
    private static final  By createAccountBtn = By.cssSelector("#form > div > div > div > div.login-form > form > button");
    private static final By accountCreatedTxt = By.cssSelector("#form > div > div > div > h2 > b");
    private static final By continueBtn = By.cssSelector("#form > div > div > div > div > a");


    private static final By adTxt = By.cssSelector("#heading > div");
    private static final By closeAdBtn = By.cssSelector("#dismiss-button");


    private static final By stylishDressAddCart = By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(6) > div > div.single-products > div.productinfo.text-center > a");
    private static final By beautifulPeacockAddCart = By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(34) > div > div.single-products > div.productinfo.text-center > a");
    private static final By menTshirtAddCart = By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.productinfo.text-center > a");
    private static final By continueShopping = By.cssSelector("#cartModal > div > div > div.modal-footer > button");
    private static final By goToCartBtn = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");

    private static final By validarStylishDress = By.cssSelector("#product-4 > td.cart_description > h4 > a");
    private static final By validarStylishDressQtd = By.cssSelector("#product-4 > td.cart_quantity > button");

    private static final By validarBeautifulPeacock = By.cssSelector("#product-41 > td.cart_description > h4 > a");
    private static final By validarBeautifulPeacockQtd = By.cssSelector("#product-41 > td.cart_quantity > button");

    private static final By validarTshirt = By.cssSelector("#product-2 > td.cart_description > h4 > a");
    private static final By validarTshirtQtd = By.cssSelector("#product-2 > td.cart_quantity > button");



    public void clicarSingupLoginBtn(){
        click(singupLoginBtn);
    }
    public void digitarSingupName(String str){
        sendKeys(singupName, str);
    }
    public void digitarSingupEmail(String str){
        sendKeys(singupEmail, str);
    }
    public void clicarSingupBtn(){
        click(singupBtn);
    }
    public void digitarLoginEmail(String str){
        sendKeys(loginEmail, str);
    }
    public void digitarLoginSenha(String str){
        sendKeys(loginSenha, str);
    }
    public void clicarLoginBtn(){
        click(loginBtn);
    }


    public void clicarMrBtn(){
        click(mrBtn);
    }
    public void digitarSenhaForm(String str){
        sendKeys(senhaForm, str);
    }
    public void clicarDateDayForm(){
        click(dateDayForm);
    }
    public void clicarDateMonthForm(){
        click(dateMonthForm);
    }
    public void clicarDateYearForm(){
        click(dateYearForm);
    }
    public void digitarFirstNameForm(String str){
        sendKeys(firstNameForm, str);
    }
    public void digitarLastNameForm(String str){
        sendKeys(lastNameForm, str);
    }
    public void digitarCompanyForm(String str){
        sendKeys(companyForm, str);
    }
    public void digitarAddressForm(String str){
        sendKeys(addressForm, str);
    }
    public void clicarCountryForm(){
        click(countryForm);
    }
    public void digitarStateForm(String str){
        sendKeys(stateForm, str);
    }
    public void digitarCityForm(String str){
        sendKeys(cityForm, str);
    }
    public void digitarZipForm(String str){
        sendKeys(zipForm, str);
    }
    public void digitarPhoneForm(String str){
        sendKeys(phoneForm, str);
    }
    public void clicarCreateAcountBtn(){
        click(createAccountBtn);
    }
    public String lerAccountCreatedTxt(){
        return getText(accountCreatedTxt);
    }
    public void clicarContinueBtn(){
        click(continueBtn);
    }



    public void clicarAddCartStylishDress(){
        click(stylishDressAddCart);
    }
    public void clicarAddCartBeautifulPeacock(){
        click(beautifulPeacockAddCart);
    }
    public void clicarAddCartMenTshirt(){
        click(menTshirtAddCart);
    }
    public void clicarContinueShopping(){
        click(continueShopping);
    }

    public String lerValidarStylishDress(){
        return getText(validarStylishDress);
    }
    public String lerValidarStylishDressQtd(){
        return getText(validarStylishDressQtd);
    }
    public String lerValidarBeautifulPeacock(){
        return getText(validarBeautifulPeacock);
    }
    public String lerValidarBeautifulPeacockQtd(){
        return getText(validarBeautifulPeacockQtd);
    }
    public String lerValidarTshirt(){
        return getText(validarTshirt);
    }
    public String lerValidarTshirtQtd(){
        return getText(validarTshirtQtd);
    }

    public void clicarCart(){
        click(goToCartBtn);
    }

    public String lerAdTxt(){
        return getText(adTxt);
    }
    public void clicarCloseAdBtn(){
        click(closeAdBtn);
    }
}