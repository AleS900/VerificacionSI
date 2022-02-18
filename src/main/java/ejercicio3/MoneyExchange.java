package ejercicio3;

public class MoneyExchange {
    private String mssg;
    private MoneyUtils money = new MoneyUtils();
    public MoneyExchange(){}

    public MoneyExchange(MoneyUtils utilMock){
        money = utilMock;
    }

    public String saveInNewMoney(int amount, String org, String dest){
        if (amount> 0){
            mssg ="La cantidad convertida fue : [" + ( amount * money.obtenerTipoDeCambio(org, dest) ) + "] "+ dest;
        }else{
            mssg ="Cantidad Incorrecta";
        }
        return mssg;
    }
}
