import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Inicializa el navegador Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Carga la página de fichaje en el navegador
        driver.get("https://miempresa.com/fichaje");

        // Hace clic en el botón de fichar entrada
        WebElement entryButton = driver.findElement(By.xpath("//input[@value='Fichar entrada']"));
        entryButton.click();

        // Espera a que la página se cargue
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hace clic en el botón de fichar salida
        WebElement exitButton = driver.findElement(By.xpath("//input[@value='Fichar salida']"));
        exitButton.click();

        // Cierra el navegador
        driver.quit();
    }
}
