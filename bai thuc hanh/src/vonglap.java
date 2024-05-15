import java.util.ArrayList;

public class vonglap {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("java");
        arrlist.add("c++");
        arrlist.add("phd");
        System.out.println("la : ");
        for (int i=0;i<arrlist.size();i++){
            System.out.println(arrlist.get(i)+"" );
        }
    }
}
