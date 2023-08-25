package Chapter06.Pr;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
}
class Student2{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        String s = "";
        int sum;
        double avg;
        sum = kor + eng + math;
        avg = sum / 3;
        s += this.name + "," + this.ban + "," + this.kor + "," + this.eng + "," + this.math +"," + sum + "," + avg;
        return s;
    }
}