package ejercicio1Test;

import ejercicio1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateUtilsTest {
    @ParameterizedTest
    @CsvSource({
            /*Correct Data*/
            "1, agosto, 2006, 2 agosto 2006",
            "8, enero, 1978, 9 enero 1978",
            "8, febrero, 1978, 9 febrero 1978",
            "8, marzo, 1978, 9 marzo 1978",
            "8, abril, 1978, 9 abril 1978",
            "8, mayo, 1978, 9 mayo 1978",
            "8, junio, 1978, 9 junio 1978",
            "8, julio, 1978, 9 julio 1978",
            "8, agosto, 1978, 9 agosto 1978",
            "8, septiembre, 1978, 9 septiembre 1978",
            "8, octubre, 1978, 9 octubre 1978",
            "8, noviembre, 1978, 9 noviembre 1978",
            "8, diciembre, 1978, 9 diciembre 1978",
            "10, junio, 2000, 11 junio 2000",
            "22, diciembre, 1975, 23 diciembre 1975",
            "19, marzo, 2012, 20 marzo 2012",
            "28, febrero, 2019, 1 marzo 2019",
            "29, febrero, 2000, 1 marzo 2000",
            "27, febrero, 2000, 28 febrero 2000",
            "27, febrero, 1000, 28 febrero 1000",
            "31, enero, 1900, 1 febrero 1900",
            "31, marzo, 1900, 1 abril 1900",
            "30, abril, 1900, 1 mayo 1900",
            "31, mayo, 1900, 1 junio 1900",
            "30, junio, 1900, 1 julio 1900",
            "31, julio, 1900, 1 agosto 1900",
            "31, agosto, 1900, 1 septiembre 1900",
            "30, septiembre, 1900, 1 octubre 1900",
            "31, octubre, 1900, 1 noviembre 1900",
            "30, noviembre, 1900, 1 diciembre 1900",
            "31, diciembre, 1900, 1 enero 1901",
            "31, Diciembre, 1900, 1 enero 1901",

            /*Incorrect Day*/
            "-1, enero, 2000, Dia Incorrecto",
            "29, febrero, 2006, Dia Incorrecto",
            "33, marzo, 2001, Dia Incorrecto",
            "0, marzo, 2001, Dia Incorrecto",

            /*Incorrect Month*/
            "10, January, 2000, Mes Incorrecto",
            "1, June, 2015, Mes Incorrecto",
            "14, maoy, 1964, Mes Incorrecto",
            "1, HelloWorld, 1999, Mes Incorrecto",

            /*Incorrect Year*/
            "28, marzo, -3, Gestion Incorrecta",
            "11, abril, 0, Gestion Incorrecta",
            "3, octubre, -11, Gestion Incorrecta",
            "11, noviembre, -100, Gestion Incorrecta",

            /*More Than One Incorrect Info*/
            "-1 , marzo, -3, Ingresar Nuevos Datos",
            "11, HelloWorld, -1, Ingresar Nuevos Datos",
            "-1, HelloWorld, 11, Ingresar Nuevos Datos",
            "-11, HelloWorld, -100, Ingresar Nuevos Datos",
    })

    public void verifyNextDate(int day, String month, int year, String expectedResult){
        DateUtils date = new DateUtils();
        String actualResult = date.nextDate(day, month, year);
        Assertions.assertEquals(expectedResult, actualResult,"ERROR, el mensaje retornado es incorrecto!!");
    }

}
