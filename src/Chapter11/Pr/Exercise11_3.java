package Chapter11.Pr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Exercise11_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,3,100,100,100));
        list.add(new Student("남궁성",1,1,90,70,80));
        list.add(new Student("김자바",1,2,80,80,90));
        list.add(new Student("이자바",2,1,70,90,70));
        list.add(new Student("안자바",2,2,60,100,80));

        Collections.sort(list,new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

class BanNoAscending implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student){
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            if(s1.ban != s2.ban){
                return s1.ban - s2.ban;
            }
            return s1.no - s2.no;
        }
        return -1;
    }
}

class Student implements Comparable{
    String name;
    int ban;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student s = (Student) o;
            return name.compareTo(s.name);
        }
        return -1;
    }

    int no;
    int kor,eng,math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int) ((getTotal()/ 3f) * 10 +0.5)/10f;
    }

    @Override
    public String toString() {
        return name +"," + ban +"," + no +"," +kor +"," +eng+"," + math+"," +getTotal() +"," + getAverage();
    }
}