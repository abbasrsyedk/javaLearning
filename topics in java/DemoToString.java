package cool;

public class DemoToString {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Abbas");
        // System.out.println(s1.sname);
        // System.out.println(s1.rollno);
        Student s2 = new Student(2, "syed");
        System.out.println(s1);
        System.out.println(s2);

    }
}

class Student {
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

    public String toString() {
        return rollno + " " + sname;
    }
}