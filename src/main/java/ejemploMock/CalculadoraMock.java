package ejemploMock;

public class CalculadoraMock {

    public CalculadoraMock(){}
    public CalculadoraMock(MultiplicarServicio multiplicarServicio){
        this.multiplicarServicio=multiplicarServicio;
    }


    //DESARROLLADOR A
    MultiplicarServicio multiplicarServicio = new MultiplicarServicio();
    public int getFactorial(int number){
        int fact = 1;
        for(int i = 1; i<=number;i++){
            fact=multiplicarServicio.multi(fact,i);
        }

        return fact;
    }
}
