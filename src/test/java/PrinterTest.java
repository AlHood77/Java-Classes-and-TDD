import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


   Printer printer;

   @Before
    public void before(){
       printer = new Printer(100, 5, 2, 10);
   }

   @Test
    public void printerHasPaper(){
       assertEquals(100, printer.numOfSheets());
   }

   @Test
    public void printerTakesPages(){
       assertEquals(5, printer.pageCount());
   }

    @Test
    public void printerTakesCopies(){
        assertEquals(2, printer.docCopies());
    }

    @Test
    public void printerPaperVolumeReducedOnPrint(){
       assertEquals(90, printer.print());
    }

    @Test
    public void printerPaperVolumeReducedOnPrint(){
       Printer emptyPrinter =
        assertEquals(90, printer.print());
    }

}
