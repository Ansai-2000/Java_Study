package Chapter07.Ex;

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCation("Hello, World");
        stv.caption = true;
        stv.displayCation("Hello, World");
    }
}
class Tv{
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){ --channel;}
}
class SmartTv extends Tv{
    boolean caption;
    void displayCation(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
