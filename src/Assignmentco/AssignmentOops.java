package Assignmentco;


class Student{
    int id;
    String name;
    String branch;
}
 class Vehcle {
    String name = "Car";
    String color = "Yellow";


}

public class AssignmentOops {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.id = 101;
        s1.name = "Java";
        s1.branch = "CSE";
        s2.id = 102;
        s2.name = "Class";
        s2.branch = "ME";
        s3.id = 103;
        s3.name = "Hello";
        s3.branch = "ECE";
        s4.id = 102;
        s4.name = "Welcome";
        s4.branch = "civil";
        s5.id = 102;
        s5.name = "World";
        s5.branch = "MBA";

        System.out.println(s1.id+" "+s1.name+" "+s1.branch);
        System.out.println(s2.id+" "+s2.name+" "+s2.branch);
        System.out.println(s3.id+" "+s3.name+" "+s3.branch);
        System.out.println(s4.id+" "+s4.name+" "+s4.branch);
        System.out.println(s5.id+" "+s5.name+" "+s5.branch);


        Vehcle v1 = new Vehcle();
        Vehcle v2 = new Vehcle();
        Vehcle v3 = new Vehcle();
        Vehcle v4 = new Vehcle();
        Vehcle v5 = new Vehcle();

        v1.name = "Car";
        v1.color = "Yellow";
        v2.name = "Jeep";
        v2.color = "Black";
        v3.name = "Truck";
        v3.color = "Red";
        v4.name = "Ambulance";
        v4.color = "White";
        v5.name = "Tractor";
        v5.color = "Blue";

        System.out.println(v1.name+" "+v1.color);
        System.out.println(v2.name+" "+v2.color);
        System.out.println(v3.name+" "+v3.color);
        System.out.println(v4.name+" "+v4.color);
        System.out.println(v5.name+" "+v5.color);

    }


}
