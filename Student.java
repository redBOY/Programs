package main.Program;

class Student {
    int id;
    String name;
    int Rollno;
public Student() {
    id = 123;
    name = "Adithya";
    Rollno = 12;
}
}
class main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Student id is" + obj.id);
        System.out.println("Student name is" + obj.name);
        System.out.println("Student roll no is" + obj.Rollno);
    }
}
