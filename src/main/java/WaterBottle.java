public class WaterBottle {

private int volume;

public WaterBottle(int volume){
    this.volume = volume;
}

public int getInitialVolume(){
    return this.volume;
}

public int takeDrink(){
    return this.volume - 10;
}

public int emptyBottle(){
    return this.volume = 0;
}

    public int fullBottle(){
        return this.volume = 100;
    }


}
