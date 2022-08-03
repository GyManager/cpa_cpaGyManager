package GyManager.PageObject;

import GyManager.Objetos.Cliente;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClientePage extends BasePage {

    private By tbClient = By.id("tbClient");

    public ClientePage(WebDriver driver) {
        super(driver);
    }

//    public void leerTabla() {
//        WebElement mytable = super.findElement(this.tbClient);
//        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
//        //To calculate no of rows In table.
//        int rows_count = rows_table.size();
//        //Loop will execute till the last row of table.
//        for (int row = 0; row < rows_count; row++) {
//            //To locate columns(cells) of that specific row.
//            List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            //To calculate no of columns (cells). In that specific row.
//            int columns_count = Columns_row.size();
//            System.out.println("Number of cells In Row " + row + " are " + columns_count);
//            //Loop will execute till the last cell of that specific row.
//            for (int column = 0; column < columns_count; column++) {
//                // To retrieve text from that specific cell.
//                Columns_row.get(column).getText();
//                String celtext = Columns_row.get(column).getText();
//                Cliente cliente = new Cliente(Columns_row.get(0).getText(),
//                        Columns_row.get(1).getText(),
//                        Columns_row.get(2).getText(),
//                        Columns_row.get(3).getText(),
//                        Columns_row.get(4).getText(),
//                        Columns_row.get(5).getText());
//                System.out.println("Cliente>>>\n"+cliente.toString());
//                System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
//            }
//            System.out.println("-------------------------------------------------- ");
//        }
//    }

    public void leerTabla() {
        WebElement mytable = super.findElement(this.tbClient);
        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        for (int row = 0; row < rows_table.size(); row++) {
            List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
            Cliente cliente = new Cliente(Columns_row.get(0).getText(),
                    Columns_row.get(1).getText(),
                    Columns_row.get(2).getText(),
                    Columns_row.get(3).getText(),
                    Columns_row.get(4).getText(),
                    Columns_row.get(5).getText());

            System.out.println("Cliente>>>\n" + cliente.toString());
        }
    }
}

