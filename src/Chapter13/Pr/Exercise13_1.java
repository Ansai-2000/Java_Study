package Chapter13.Pr;

public class Exercise13_1{
    public static void main(String[] args) {
        new Thread(new Thread1()).start();
    }
}


class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<300;i++){
            System.out.print('-');
        }
    }
}
