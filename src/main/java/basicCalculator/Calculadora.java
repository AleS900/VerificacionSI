package basicCalculator;

public class Calculadora {

    public Calculadora(){};

    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return -1;
    }
    public int multi(int a, int b) throws InterruptedException {
        Thread.sleep(6000);
        return a*b;
    }
    public int division(int a, int b){
        if (b == 0)
            throw new ArithmeticException("el segundo valor NO puede ser 0");

        return a/b;
    }
}