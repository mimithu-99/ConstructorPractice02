package constructorP01;

public class Students {
    int sid;
    String name1;
    char grad;

    void printStudentData(){
        System.out.println(sid +"  " + name1 +" " +grad);
    }

    void setStudentData(int id, String name, char gr){
        sid = id;
        name1 = name;
        grad = gr;

    }
}
