public class Calculator {
    private int num1;
    private int num2;
    private double num3;
    private double num4;

    public Calculator(int num1, int num2, double num3, double num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int addNumber(){
        return this.num1 + this.num2;
    }

    public int subtractNumber(){
        return this.num1 - this.num2;
    }

    public int multiplyNumber(){
        return this.num1 * this.num2;
    }

    public double divideNumber(){
        return this.num3 / this.num4;
    }

}
