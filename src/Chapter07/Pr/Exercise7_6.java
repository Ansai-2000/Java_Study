package Chapter07.Pr;

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner iv = outer.new Inner();
        System.out.println(iv.iv);
    }
}
class Outer{
    class Inner{
        int iv = 100;
    }
}
