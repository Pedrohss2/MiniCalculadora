package entities;

public class Calculator {
    private double numberOne;
    private double numberTwo;

    public void setNumbers(double num1, double num2){
        this.numberOne = num1;
        this.numberTwo = num2;
    }

    //-------------------------------------------//
    public double getNumberOne(){
        return numberOne;
    }

    public double getNumberTwo(){
        return numberTwo;
    }
    //----------------------------------------------//
    public double soma(){
        return getNumberOne() + getNumberTwo();
    }
    public double subtracao(){
        return getNumberOne() - getNumberTwo();
    }

    public double multiplicacao(){
        return getNumberOne() * getNumberTwo();
    }
    public double divisao(){
        return getNumberOne() / getNumberTwo();
    }

}
