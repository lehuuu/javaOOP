import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide107_chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer , Character> treemap = new TreeMap<>();
        treemap.put(2,'a');
        treemap.put(1,'b');
        treemap.put(3,'c');
        treemap.put(4,'d');
       Set<Map.Entry<Integer,Character>> settreemap = treemap.entrySet();
        System.out.println("cac entry co trong settreemap : ");
        System.out.println(settreemap);
    }
}
