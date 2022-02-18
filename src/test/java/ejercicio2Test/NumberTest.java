package ejercicio2Test;

import ejercicio2.Generador;
import ejercicio2.PrimoUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class NumberTest {
    PrimoUtils primoMock = Mockito.mock(PrimoUtils.class);

    @Test
    public void generateNumbersTestUno()throws Exception{
        Mockito.when(primoMock.esPrimo(1)).thenReturn(false);
        Generador generateNumbers = new Generador(primoMock);
        String actualResult = generateNumbers.getNumberValues(1);
        String expectedResult = "1 ";
        Assertions.assertEquals(actualResult,expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(primoMock).esPrimo(1);
    }

    @Test
    public void generateNumbersTestNoPrimo()throws Exception{
        Mockito.when(primoMock.esPrimo(8)).thenReturn(false);
        Generador generateNumbers = new Generador(primoMock);
        String actualResult = generateNumbers.getNumberValues(8);
        String expectedResult = "1 3 5 7 ";
        Assertions.assertEquals(actualResult,expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(primoMock).esPrimo(8);
    }

    @Test
    public void generateNumbersTestNoPrimo2()throws Exception{
        Mockito.when(primoMock.esPrimo(21)).thenReturn(false);
        Generador generateNumbers = new Generador(primoMock);
        String actualResult = generateNumbers.getNumberValues(21);
        String expectedResult = "1 3 5 7 9 11 13 15 17 19 21 ";
        Assertions.assertEquals(actualResult,expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(primoMock).esPrimo(21);

    }

    @Test
    public void generateNumbersTestPrimo()throws Exception{
        Mockito.when(primoMock.esPrimo(11)).thenReturn(true);
        Generador generateNumbers = new Generador(primoMock);
        String actualResult = generateNumbers.getNumberValues(11);
        String expectedResult = "2 4 6 8 10 ";
        Assertions.assertEquals(actualResult,expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(primoMock).esPrimo(11);

    }

    @Test
    public void generateNumbersTestPrimo2()throws Exception{
        Mockito.when(primoMock.esPrimo(2)).thenReturn(true);
        Generador generateNumbers = new Generador(primoMock);
        String actualResult = generateNumbers.getNumberValues(2);
        String expectedResult = "2 ";
        Assertions.assertEquals(actualResult,expectedResult,"ERROR, el mensaje retornado es incorrecto!!");
        Mockito.verify(primoMock).esPrimo(2);

    }

    @Test
    public void generateNumbersTestException() {
        Mockito.when(primoMock.esPrimo(0)).thenReturn(false);
        Generador generateNumbers = new Generador(primoMock);
        Assertions.assertThrows(Exception.class, ()-> generateNumbers.getNumberValues(0));
    }

    @Test
    public void generateNumbersTestException2() {
        Mockito.when(primoMock.esPrimo(-1)).thenReturn(false);
        Generador generateNumbers = new Generador(primoMock);
        Assertions.assertThrows(Exception.class, ()-> generateNumbers.getNumberValues(-1));
    }
}