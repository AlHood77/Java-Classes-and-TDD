import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


   Printer printer;

   @Before
    public void before(){
       printer = new Printer(100, 5, 2, 12);
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
    public void notEnoughPaper(){
       Printer almostEmptyPrinter = new Printer(7, 2, 5, 10);
        assertEquals(7, almostEmptyPrinter.print());
    }

    @Test
    public void volumeofToner(){
       assertEquals(12, printer.getTonerVolume());
    }

    @Test
    public void reduceTonerOnPrint(){
       Printer Printer2 = new Printer(10, 2, 5, 15);
       assertEquals(5, Printer2.reduceTonerVolume());
    }

}
