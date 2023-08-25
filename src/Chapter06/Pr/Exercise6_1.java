package Chapter06.Pr;

public class Exercise6_1 {

}
class Student1{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
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