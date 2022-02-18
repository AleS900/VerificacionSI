package cambioMonedaTest;

import ejercicio3.MoneyExchange;
import ejercicio3.MoneyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MoneyTest {
    MoneyUtils moneyMock = Mockito.mock(MoneyUtils.class);

    @Test
    public void verifyExchange(){
        Mockito.when(moneyMock.obtenerTipoDeCambio("Dólares", "Bolivianos")).thenReturn(7);
        MoneyExchange moneyExchange = new MoneyExchange(moneyMock);
        String actualResult = moneyExchange.saveInNewMoney(100, "Dólares", "Bolivianos");
        String expectedResult = "La cantidad convertida fue : [700] Bolivianos";
        Assertions.assertEquals(actualResult, expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(moneyMock).obtenerTipoDeCambio("Dólares", "Bolivianos");
    }

    @Test
    public void verifyExchange2(){
        Mockito.when(moneyMock.obtenerTipoDeCambio("Euros", "Bolivianos")).thenReturn(8);
        MoneyExchange moneyExchange = new MoneyExchange(moneyMock);
        String actualResult = moneyExchange.saveInNewMoney(300, "Euros", "Bolivianos");
        String expectedResult = "La cantidad convertida fue : [2400] Bolivianos";
        Assertions.assertEquals(actualResult, expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(moneyMock).obtenerTipoDeCambio("Euros", "Bolivianos");
    }

    @Test
    public void verifyExchange3(){
        Mockito.when(moneyMock.obtenerTipoDeCambio("Dólares", "Yenes")).thenReturn(115);
        MoneyExchange moneyExchange = new MoneyExchange(moneyMock);
        String actualResult = moneyExchange.saveInNewMoney(250, "Dólares", "Yenes");
        String expectedResult = "La cantidad convertida fue : [28750] Yenes";
        Assertions.assertEquals(actualResult, expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(moneyMock).obtenerTipoDeCambio("Dólares", "Yenes");
    }


    @Test
    public void verifyWrongExchange(){

        Mockito.when(moneyMock.obtenerTipoDeCambio("Euros", "Bolivianos")).thenReturn(7);
        MoneyExchange moneyExchange = new MoneyExchange(moneyMock);
        String actualResult = moneyExchange.saveInNewMoney(-100, "Euros", "Bolivianos");
        String expectedResult = "Cantidad Incorrecta";
        Assertions.assertEquals(actualResult, expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        //Mockito.verify(objetoMock).obtenerTipoDeCambio("Euros", "Bolivianos");
    }

}