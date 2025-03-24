package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;

    @Given("^Cuando ingreso a tienda nube$")
    public void cuando_ingreso_a_tienda_nube() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tiendanube.com/");
        driver.manage().window().maximize();


    }

    @And("^Presiono Login$")
    public void presiono_Login() throws Throwable {
        WebElement locatorBTNLogin = driver.findElement(By.xpath("/html/body/header/div/div/nav/div[2]/div[2]/ul/li[2]/div[2]/a[1]"));
        locatorBTNLogin.click();

    }

    @And("^Ingreso mi Mail$")
    public void ingreso_mi_Mail() throws Throwable {
        WebElement locatorIngresoMail = driver.findElement(By.xpath("//input[@id='user-mail']"));
        locatorIngresoMail.sendKeys("spawnro2@gmail.com");

    }

    @And("^Ingreso mi contraseña erronea$")
    public void ingreso_mi_contraseña_erronea() throws Throwable {
        WebElement locatorIngresoContraseñaErronea = driver.findElement(By.xpath("//input[@id='pass']"));
        locatorIngresoContraseñaErronea.sendKeys("diego178888");

    }

    @When("^Presiono el botón Ingreso a mi Tienda$")
    public void presiono_el_botón_Ingreso_a_mi_Tienda() throws Throwable {
        WebElement locatorIngresoAMiTienda = driver.findElement(By.xpath("//input[@value='Ingresar a mi tienda']"));
        locatorIngresoAMiTienda.click();

    }

    @Then("^Saldra un mensaje Tu email o contraseña son incorrectos\\. Revisalos y volvé a intentar$")
    public void saldra_un_mensaje_Tu_email_o_contraseña_son_incorrectos_Revisalos_y_volvé_a_intentar() throws Throwable {
        WebElement mensajeError = driver.findElement(By.xpath("//div[contains(text(),'Tu email o contraseña son incorrectos. Revisalos y')]"));
        Assert.assertEquals(mensajeError.getText(), "Tu email o contraseña son incorrectos. Revisalos y volvé a intentar.");

    }

    @Given("^Ingreso mi contraseña correcta$")
    public void ingreso_mi_contraseña_correcta() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Saldra un mensaje Inicio$")
    public void saldra_un_mensaje_Inicio() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Presiono boton de ventas$")
    public void presiono_boton_de_ventas() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^ingreso un nombre a buscar$")
    public void ingreso_un_nombre_a_buscar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Presiono Enter$")
    public void presiono_Enter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Saldran datos del cliente que se busco$")
    public void saldran_datos_del_cliente_que_se_busco() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Ingreso a buscar e ingreso un nombre$")
    public void ingreso_a_buscar_e_ingreso_un_nombre() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Given("^Selecciono numero de compra y presiono enter$")
    public void selecciono_numero_de_compra_y_presiono_enter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Aparecen los datos del usuario$")
    public void aparecen_los_datos_del_usuario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^elijo su correo$")
    public void elijo_su_correo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Se visualiza la vista de mensajes$")
    public void se_visualiza_la_vista_de_mensajes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Presiono PokeStop$")
    public void presiono_PokeStop() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Cierro sesion$")
    public void cierro_sesion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Visualizo el login de tienda nube$")
    public void visualizo_el_login_de_tienda_nube() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
