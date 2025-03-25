package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test {

    private ChromeDriver driver;
    private WebDriverWait wait;

    @Given("^Cuando ingreso a tienda nube$")
    public void cuando_ingreso_a_tienda_nube() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.get("https://www.tiendanube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

    @And("^Ingreso mi contrasena erronea$")
    public void ingreso_mi_contrasena_erronea() throws Throwable {
        WebElement locatorIngresoContrasenaErronea = driver.findElement(By.xpath("//input[@id='pass']"));
        locatorIngresoContrasenaErronea.sendKeys("diego178888");

    }

    @When("^Presiono el boton Ingreso a mi Tienda$")
    public void presiono_el_boton_Ingreso_a_mi_Tienda() throws Throwable {
        WebElement locatorIngresoAMiTienda = driver.findElement(By.xpath("//input[@value='Ingresar a mi tienda']"));
        locatorIngresoAMiTienda.click();
        Thread.sleep(10000);

    }

    @Then("^Saldra un mensaje Tu email o contrasena son incorrectos\\. Revisalos y volvé a intentar$")
    public void saldra_un_mensaje_Tu_email_o_contrasena_son_incorrectos_Revisalos_y_volvé_a_intentar() throws Throwable {
        WebElement mensajeError = driver.findElement(By.xpath("//div[contains(text(),'Tu email o contrasena son incorrectos. Revisalos y')]"));
        Assert.assertEquals(mensajeError.getText(), "Tu email o contrasena son incorrectos. Revisalos y volvé a intentar.");

    }

    @Given("^Ingreso mi contrasena correcta$")
    public void ingreso_mi_contrasena_correcta() throws Throwable {
        WebElement locatorContrasenaCorrecta = driver.findElement(By.xpath("//input[@id='pass']"));
        locatorContrasenaCorrecta.sendKeys("diego170915#");

    }

    @Then("^Saldra un mensaje Inicio$")
    public void saldra_un_mensaje_Inicio() throws Throwable {

        WebElement locatorMensajeInicio = driver.findElement(By.xpath("//h1[contains(text(),'Inicio')]"));
        Assert.assertEquals(locatorMensajeInicio.getText(), "Inicio");
    }

    @When("^Presiono boton de ventas$")
    public void presiono_boton_de_ventas() throws Throwable {
        WebElement locatorBtnVentas = driver.findElement(By.xpath("//p[contains(text(),'Ventas')]"));
        locatorBtnVentas.click();
    }

    @When("^ingreso un nombre a buscar$")
    public void ingreso_un_nombre_a_buscar() throws Throwable {
        WebElement loactorIngresoNombre = driver.findElement(By.xpath("//input[@placeholder='Buscar']"));
        loactorIngresoNombre.sendKeys("rodolfo");
    }

    @When("^Presiono Enter$")
    public void presiono_Enter() throws Throwable {
        Thread.sleep(10000);
        WebElement locatorEnterNombre = driver.findElement(By.xpath("//input[@value='rodolfo']"));
        locatorEnterNombre.sendKeys(Keys.ENTER);
    }

    @Then("^Saldran datos del cliente que se busco$")
    public void saldran_datos_del_cliente_que_se_busco() throws Throwable {
        WebElement locatorMensajeVentaCancelada = driver.findElement(By.xpath("//p[contains(text(),'Venta cancelada')]"));
        Assert.assertEquals(locatorMensajeVentaCancelada.getText(), "Venta cancelada");
    }


    @Given("^Selecciono numero de compra y presiono enter$")
    public void selecciono_numero_de_compra_y_presiono_enter() throws Throwable {
        WebElement locatorSeleccionNumeroVenta = driver.findElement(By.xpath("//a[contains(text(),'#1843')]"));
        locatorSeleccionNumeroVenta.click();
    }

    @Given("^Aparecen los datos del usuario$")
    public void aparecen_los_datos_del_usuario() throws Throwable {
        WebElement locatorDatosUsuario = driver.findElement(By.xpath("//a[contains(text(),'962545')]"));
        Assert.assertEquals(locatorDatosUsuario.getText(), "962545885");
    }

    @When("^elijo su correo$")
    public void elijo_su_correo() throws Throwable {
        WebElement locatorSeleccionCorreo = driver.findElement(By.xpath("//a[contains(text(),'crownro213')]"));
        locatorSeleccionCorreo.click();
    }

    @Then("^Se visualiza la vista de mensajes$")
    public void se_visualiza_la_vista_de_mensajes() throws Throwable {
        WebElement locatorMensajeCorreo = driver.findElement(By.xpath("//textarea[@id='input_content']"));
        locatorMensajeCorreo.sendKeys("termino");
    }

    @Given("^Presiono PokeStop$")
    public void presiono_PokeStop() throws Throwable {
        //WebElement locatorBtnPockeStop = driver.findElement(By.xpath("//p[contains(text(),'PokeStop')]"));
        WebElement locatorBtnPockeStop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'PokeStop')]")));

        locatorBtnPockeStop.click();
        Thread.sleep(2000);
    }

    @When("^Cierro sesion$")
    public void cierro_sesion() throws Throwable {
        //WebElement locatorCierroSesion = driver.findElement(By.xpath("//p[contains(text(),'Cerrar Sesión')]"));
        WebElement locatorCierroSesion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='nimbus-popover-floating']/div[@id=':rf:']/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/p[1]")));
        locatorCierroSesion.click();
    }

    @Then("^Visualizo el login de tienda nube$")
    public void visualizo_el_login_de_tienda_nube() throws Throwable {
        WebElement locatorMensajeLogin = driver.findElement(By.xpath("//h1[contains(text(),'Login')]"));
        Assert.assertEquals(locatorMensajeLogin.getText(), "Login");
    }
}
