package Assignmentco;

    class Employee{
        int id;
        String name;
        float salary;
        void run(int i,String n,float s){
            id=i;
            name=n;
            salary = s;
        }
        void display(){
            System.out.println(id+" "+name+" "+salary);
        }
    }

public class Assign2 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.run(11,"java",80000);
        e2.run(11,"python",90000);
        e3.run(11,"JavaScript",99000);
        e4.run(11,"React js",10000);
        e5.run(11,"Node Js",110000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}
