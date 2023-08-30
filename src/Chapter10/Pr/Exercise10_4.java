package Chapter10.Pr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        birth.set(2000,0,01);
        today.set(2016,0,29);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("birth day=" + sdf.format(new Date(birth.getTimeInMillis())));
        System.out.println("today =" + sdf.format(new Date(today.getTimeInMillis())));
        long diff = (today.getTimeInMillis() - birth.getTimeInMillis()) / 1000;
        System.out.println(diff / (60 * 60 * 24) + " days");
    }
}
