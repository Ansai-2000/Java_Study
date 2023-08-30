package Chapter09.Pr;

public class Exercise9_3 {
    public static int count(String src, String target){
        int count = 0;
        int pos = 0;
        while(pos < src.length()){
            int i = src.indexOf(target,pos);
            if (i == -1){
                break;
            }
            else{
                count += 1;
                pos = i + target.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345","AB"));
    }
}
