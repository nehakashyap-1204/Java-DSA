package OOPS;

public class StudentClass {

    public static void main(String[] args) {
//        Student s1 = new Student(); // declaration
//        s1.name = "Neha"; // initialization
//        s1.rno = 24;
//        s1.percent = 80;
//
//        Student s2 = new Student();
//        s2.name = "Kashyap";
//        s2.rno = 30;
//        s2.percent = 77.50;

        Student s3 = new Student();
        s3.name = "kashyap";
        s3.percent = 98.93;
        s3.rno = 8;
        System.out.println(s3.rno);

        s3.setRno(80);
        System.out.println(s3.getRno());
    }
}
