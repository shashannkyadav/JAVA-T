package Assignmentco;

    class University {
        int register;
        String branch;

        void run(int r, String b) {
            register = r;
            branch = b;
            System.out.println(register + " " + branch);
        }
    }
class Rest{
    int table;
    String name;
    String food;

    void display(int t,String n, String f){
        table = t;
        name = n;
        food = f;

        System.out.println(table+" "+name+" "+food);
    }
}

    class Drawing{
        String shape1;
        String shape2;

        void Draw(String s1,String s2){
            shape1 = s1;
            shape2 = s2;
            System.out.println(shape1+" "+ shape2);
        }
    }


public class OopsA1 {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        University u3 = new University();
        University u4 = new University();
        University u5 = new University();

        u1.run(101,"CSE");
        u2.run(102,"ECE");
        u3.run(103,"ME");
        u4.run(104,"CIVIL");
        u5.run(105,"MBA");

        Rest r1 = new Rest();
        Rest r2 = new Rest();
        Rest r3 = new Rest();
        Rest r4 = new Rest();
        Rest r5 = new Rest();

        r1.display(1,"Taj","South Indian");
        r2.display(2,"Haldi Ram","North Indian");
        r3.display(3,"MC Donald","West Indian");
        r4.display(4,"Street Food","East Indian");
        r5.display(5,"HighWAy","South East Indian");

        Drawing d1 = new Drawing();
        Drawing d2 = new Drawing();
        Drawing d3 = new Drawing();
        Drawing d4 = new Drawing();
        Drawing d5 = new Drawing();

        d1.Draw("rectangle","Heart Shape");
        d2.Draw("rectangle","Heart Shape");
        d3.Draw("rectangle","Heart Shape");
        d4.Draw("rectangle","Heart Shape");
        d5.Draw("rectangle","Heart Shape");




    }
}
