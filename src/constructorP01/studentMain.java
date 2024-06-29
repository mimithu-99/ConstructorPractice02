package constructorP01;

public class studentMain {
    public static void main(String[] args) {

        Students ob1 = new Students();
        // 1) using object reference variable
        ob1.sid = 101;
        ob1.name1 = "Mithu";
        ob1.grad = 'A';

        ob1.printStudentData();
    }
}
