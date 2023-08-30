package Chapter10.Pr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_3 {
    static int paycheckCount(Calendar from, Calendar to){
        if (from == null || to == null){
            return 0;
        }
        if (from == to && from.get(Calendar.DATE) == 21){
            return 1;
        }
        int mondiff = (to.get(Calendar.YEAR) * 12 + to.get(Calendar.MONTH)) - (from.get(Calendar.YEAR) * 12 + from.get(Calendar.MONTH));
        if (mondiff < 0 ){
            return 0;
        }
        if (from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21){
            mondiff += 1;
        }
        else if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21){
            mondiff -= 1;
        }
        return mondiff;
    }
    static void printResult(Calendar from, Calendar to){
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from,to));
    }
    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020,0,1);
        toCal.set(2020,0,1);
        printResult(fromCal,toCal);

        fromCal.set(2020,0,21);
        toCal.set(2020,0,21);
        printResult(fromCal,toCal);

        fromCal.set(2020,0,1);
        toCal.set(2020,2,1);
        printResult(fromCal,toCal);

        fromCal.set(2020,0,1);
        toCal.set(2020,2,23);
        printResult(fromCal,toCal);

        fromCal.set(2020,0,23);
        toCal.set(2020,2,21);
        printResult(fromCal,toCal);

        fromCal.set(2021,0,22);
        toCal.set(2020,2,21);
        printResult(fromCal,toCal);
    }
}
