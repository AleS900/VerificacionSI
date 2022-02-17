package ejercicio1Test;

import ejercicio1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateUtilsTest {
    @ParameterizedTest
    @CsvSource({
            /*Correct Data*/
            "1, mayo, 2006, 2 mayo 2006",
            "8, mayo, 1978, 9 mayo 1978",
            "10, junio, 2000, 11 junio 2000",
            "22, diciembre, 1975, 23 diciembre 1975",
            "19, marzo, 2012, 20 marzo 2012",
            "28, febrero, 2019, 1 marzo 2019",
            "29, febrero, 2000, 1 marzo 2000",
            "31, diciembre, 1900, 1 enero 1901",

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
