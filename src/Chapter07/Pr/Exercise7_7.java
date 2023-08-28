package Chapter07.Pr;

public class Exercise7_7 {
    public static void main(String[] args) {
        Outer2.Inner iv = new Outer2.Inner();
        System.out.println(iv.iv);
    }
}

class Outer2{
    static class Inner{
        int iv = 200;
    }
}
