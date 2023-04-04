import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getFromGraphana {

WebDriver driver;
    @Test
    public void  getGraphanaData() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/chathurajayasinghe/Documents/Driver/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Scanner sc = new Scanner(new File("src/main/java/org/example/TRList.txt"));
        List<String> TRList = new ArrayList<String>();
        while (sc.hasNextLine()) {
            TRList.add(sc.nextLine());
        }


        String[] TR_List = TRList.toArray(new String[0]);




        for (String TR:TR_List) {
            driver.findElement(By.xpath("//*[contains(@aria-label,'Dashboard template variables submenu Label transaction')]/..//*/div")).click();

            driver.findElement(By.xpath("//*[@class=\"gf-form-input\"]")).sendKeys(TR);

            String xpsth = "Dashboard template variables Variable Value DropDown option text "+TR;
            System.out.printf("//*[@aria-label=\\\"\"+xpsth+\"\\\"]");
            driver.findElement(By.xpath("//*[@aria-label=\""+xpsth+"\"]")).click();

            Thread.sleep(10000);
            String TotalRequest = driver.findElement(By.xpath("(//*[contains(@aria-label,'Panel container title Total Requests')])[2]//*[@class=\"singlestat-panel-value\"]/span")).getText();

            String TotalErrorRequest = driver.findElement(By.xpath("(//*[contains(@aria-label,'Panel container title Failed Requests')])[2]//*[@class=\"singlestat-panel-value\"]")).getText();

            String TotalErrorPerc = driver.findElement(By.xpath("(//*[@id=\"flotGaugeValue0\"])[2]")).getText();

            String nineth = driver.findElement(By.xpath("(//*[@title=\"90th Percentile\"])/../../..//*[@class=\"graph-legend-value avg\"]")).getText();

            FileWriter writer2 = new FileWriter("src/main/java/org/example/good.txt", true);
            writer2.write(TR +","+TotalRequest+","+TotalErrorRequest+","+TotalErrorPerc+","+nineth+ System.lineSeparator());
            writer2.close();

        }

    }

    @AfterMethod
    public void closeDriver()
    {
        driver.close();
    }
}
