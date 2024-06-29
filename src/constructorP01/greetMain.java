package constructorP01;

public class greetMain {
    public static void main(String[] args) {
        greetMain gr = new greetMain();
        noReturnP01 ob = new noReturnP01();

        ob.m1();

        // No parameter But return value.
        //String s = ob.m2();
        //System.out.println(s);
        System.out.println(ob.m2());

        ob.m3(" , Mithu");

        String va = ob.m4(", Muntaha");
        System.out.println(va);

    }
}
