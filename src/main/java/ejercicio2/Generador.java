package ejercicio2;

public class Generador {
    PrimoUtils prime = new PrimoUtils();

    public Generador(PrimoUtils objetoMockeado){
        prime = objetoMockeado;
    }

    public String getNumberValues(int number) throws Exception {
        StringBuilder ans= new StringBuilder();
        if(number <= 0){
            throw new Exception("Dato Ingresado incorrecto");
        }else if (prime.esPrimo(number)){
            for(int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    ans.append(i).append(" ");
                }
            }
        } else {
            for(int i = 1; i <= number; i++){
                if (i%2!=0) {
                    ans.append(i).append(" ");
                }
            }
        }
        return ans.toString();
    }
}