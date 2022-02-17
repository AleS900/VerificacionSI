package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class DateUtils {
    public String nextDate(int day, String month, int year) {
        String msg = "";
        String mth = month.toLowerCase();
        List<String> monthsArr = new ArrayList<>();
        monthsArr.add("enero");
        monthsArr.add("febrero");
        monthsArr.add("marzo");
        monthsArr.add("abril");
        monthsArr.add("mayo");
        monthsArr.add("junio");
        monthsArr.add("julio");
        monthsArr.add("agosto");
        monthsArr.add("septiembre");
        monthsArr.add("octubre");
        monthsArr.add("noviembre");
        monthsArr.add("diciembre");
        boolean boolDay = day < 32 && day > 0;
        boolean boolMonth = monthsArr.contains(month.toLowerCase());
        boolean boolYear = year > 0;
        int max31=31;
        int max30=30;
        int max28=28;
        int max29=29;
        int max;

        if(mth.equals("abril") || mth.equals("junio") || mth.equals("septiembre") || mth.equals("noviembre")){
            max=max30;
        } else if(mth.equals("enero") || mth.equals("marzo") || mth.equals("mayo") || mth.equals("julio") || mth.equals("agosto") || mth.equals("octubre") || mth.equals("diciembre") ){
            max=max31;
        } else if (!mth.equals("febrero")){
            max=max30;
        } else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            max=max29;
        } else {
            max=max28;
        }

        if (boolDay && boolMonth && boolYear) {
            switch (month.toLowerCase()){
                case "enero":
                    if (day == max){
                        msg = 1 + " febrero " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "febrero":
                    if (day > max){
                        msg = "Dia Incorrecto";
                    }else if (day == max){
                        msg = 1 + " marzo " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "marzo":
                    if (day == max){
                        msg = 1 + " abril " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "abril":
                    if (day == max){
                        msg = 1 + " mayo " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "mayo":
                    if (day == max){
                        msg = 1 + " junio " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "junio":
                    if (day == max){
                        msg = 1 + " julio " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "julio":
                    if (day == max){
                        msg = 1 + " agosto " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "agosto":
                    if (day == max){
                        msg = 1 + " septiembre " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "septiembre":
                    if (day == max){
                        msg = 1 + " octubre " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "octubre":
                    if (day == max){
                        msg = 1 + " noviembre " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "noviembre":
                    if (day == max){
                        msg = 1 + " diciembre " + year;
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
                case "diciembre":
                    if (day == max){
                        msg = 1 + " enero " + (year+1);
                    }else {
                        msg = (day+1) + " " + mth + " " + year;
                    }
                    break;
            }
        } else {
            if(!boolDay && !boolMonth || !boolMonth && !boolYear || !boolDay && !boolYear){
                msg = "Ingresar Nuevos Datos";
            } else if(!boolDay){
                msg = "Dia Incorrecto";
            } else if(!boolMonth){
                msg = "Mes Incorrecto";
            } else {
                msg = "Gestion Incorrecta";
            }

        }
        return msg;
    }
}
