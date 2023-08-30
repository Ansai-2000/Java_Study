package Chapter10.Pr;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {
    public static void main(String[] args) {
        String[] day = {"","일","월","화","수","목","금","토"};
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)");
        Scanner s = new Scanner(System.in);
        Date d = null;
        while(s.hasNextLine()){
            try{
                d = df.parse(s.nextLine());
                break;
            }catch (Exception e){
                System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)");
            }
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        System.out.println("입력하신 날짜는 " + day[cal.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
    }
}
