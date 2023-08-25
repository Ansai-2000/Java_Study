package Chapter06.Pr;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}
class Student3{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return this.kor + this.eng + this.math;
    }

    float getAverage(){
        return (float)(Math.round((getTotal() / 3.0) * 10) / 10.0);
    }
}