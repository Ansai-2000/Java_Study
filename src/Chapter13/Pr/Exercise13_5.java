package Chapter13.Pr;

public class Exercise13_5 {
    static boolean stopped = false;
    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();
        try{
            Thread.sleep(6000);
        }catch (Exception e){}
        stopped = true;
        System.out.println("stopped");
    }
}

class Thread5 extends Thread{
    @Override
    public void run() {
        for(int i=0;!Exercise13_5.stopped;i++){
            System.out.println(i);
            try{
                Thread.sleep(30000);
            }catch (Exception e){}

        }
    }
}
