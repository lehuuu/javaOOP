import java.util.LinkedHashSet;
import java.util.Set;

public class slide61_chuong4 {
    public static void main(String[] args) {
        Set<String> link = new LinkedHashSet<String>();
        link.add("c++");
        link.add("java");
        link.add("c#");
        link.add("php");
        for (String str : link  ) {
             System.out.println(str);
        }
    }
}
