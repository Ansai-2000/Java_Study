package Chapter13.Ex;

import java.util.ArrayList;

public class Ex13_15 {
    public static void main(String[] args) throws Exception{
        Table2 table2 = new Table2();
        new Thread(new Cook2(table2),"COOK").start();
        new Thread(new Customer2(table2,"donut"),"CUST1").start();
        new Thread(new Customer2(table2,"burger"),"CUST2").start();

        Thread.sleep(2000);
        System.exit(0);

    }
}

class Customer2 implements Runnable{
    private Table2 table2;
    private String food;

    public Customer2(Table2 table2, String food) {
        this.table2 = table2;
        this.food = food;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
            String name = Thread.currentThread().getName();;
            table2.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook2 implements Runnable{
    private Table2 table2;

    public Cook2(Table2 table2) {
        this.table2 = table2;
    }

    @Override
    public void run() {
        while (true){
            int idx = (int)(Math.random() * table2.dishNum());
            table2.add(table2.dishNames[idx]);
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){}
        }
    }
}

class Table2{
    String[] dishNames = {"donut","donut","burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        while(dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name + "is waiting.");
            try{
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes:" + dishes.toString());
    }

    public void remove(String dishName){
        synchronized (this){
            String name = Thread.currentThread().getName();
            while(dishes.size()==0){
                System.out.println(name + " is waiting.");
                try{
                    wait();
                    Thread.sleep(500);
                }catch (InterruptedException e){}
            }
            while(true){
                for(int i=0;i<dishes.size();i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }
                try{
                    System.out.println(name + "is waiting.");
                    wait();
                    Thread.sleep(500);
                }catch (InterruptedException e){}
            }
        }
    }
    public int dishNum(){
        return dishNames.length;
    }
}