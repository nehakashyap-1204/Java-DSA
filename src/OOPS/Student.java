package OOPS;

public class Student {
    String name;
    int rno;
    double percent;

    // default constructor
    public Student() {

    }

    public Student(String name, int rno, double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }

    public int getRno(){   // getter
        return rno;
    }

    public void setRno(int rno) { // setter
       this.rno = rno;
    }
}
