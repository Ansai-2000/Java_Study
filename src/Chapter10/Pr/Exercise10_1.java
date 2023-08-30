package Chapter10.Pr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        for(int i=0;i<12;i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2020);
            cal.set(Calendar.MONTH, i);
            cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
            cal.set(Calendar.DAY_OF_WEEK, 1);
            Date d = cal.getTime();
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));

        }
    }
}
