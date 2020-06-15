import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {waterBottle = new WaterBottle(100);}

    @Test
    public void bottleHasInitialVolume100(){
        assertEquals(100, waterBottle.getInitialVolume());
    }

    @Test
    public void volumeReducedBy10PerDrink(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void volumeOfUsedDrinkReducedBy10PerDrink(){
        WaterBottle usedWaterBottle = new WaterBottle(80);
        assertEquals(70, usedWaterBottle.takeDrink());
    }

    @Test
    public void emptyWaterBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fullWaterBottle(){
        assertEquals(100, waterBottle.fullBottle());
    }
}
