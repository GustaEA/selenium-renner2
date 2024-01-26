package steps;

import DataFactory.PessoaDataFactory;
import Model.PessoaModel;
import commons.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class HomeSteps extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void testAddProductToCart(){
        PessoaModel pessoa = PessoaDataFactory.pessoaValida();
        homePage.clicarSingupLoginBtn();
        homePage.digitarSingupName(pessoa.getNome() + " " + pessoa.getSobrenome());
        homePage.digitarSingupEmail(pessoa.getEmail());
        homePage.clicarSingupBtn();

        homePage.clicarMrBtn();
        homePage.digitarSenhaForm(pessoa.getSenha());
        homePage.clicarDateDayForm();
        homePage.clicarDateMonthForm();
        homePage.clicarDateYearForm();
        homePage.digitarFirstNameForm(pessoa.getNome());
        homePage.digitarLastNameForm(pessoa.getSobrenome());
        homePage.digitarCompanyForm(pessoa.getEmpresa());
        homePage.digitarAddressForm(pessoa.getEndereco());
        homePage.clicarCountryForm();
        homePage.digitarStateForm(pessoa.getEstado());
        homePage.digitarCityForm(pessoa.getCidade());
        homePage.digitarZipForm(pessoa.getCep());
        homePage.digitarPhoneForm(pessoa.getNumeroCel());
        homePage.clicarCreateAcountBtn();

        Assert.assertEquals("ACCOUNT CREATED!", homePage.lerAccountCreatedTxt());

        homePage.clicarContinueBtn();

        for (int i = 0; i < 3; i++) {
            homePage.clicarAddCartStylishDress();
            homePage.clicarContinueShopping();
        }
        for (int i = 0; i < 2; i++) {
            homePage.clicarAddCartBeautifulPeacock();
            homePage.clicarContinueShopping();
        }
        homePage.clicarAddCartMenTshirt();
        homePage.clicarContinueShopping();
        homePage.clicarCart();

        Assert.assertEquals("Stylish Dress", homePage.lerValidarStylishDress());
        Assert.assertEquals("3", homePage.lerValidarStylishDressQtd());

        Assert.assertEquals("Beautiful Peacock Blue Cotton Linen Saree", homePage.lerValidarBeautifulPeacock());
        Assert.assertEquals("2", homePage.lerValidarBeautifulPeacockQtd());

        Assert.assertEquals("Men Tshirt", homePage.lerValidarTshirt());
        Assert.assertEquals("1", homePage.lerValidarTshirtQtd());

    }
}