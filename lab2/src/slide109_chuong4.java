import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide109_chuong4 {
   

    public static void main(String[] args) {
        TreeMap<Integer , Double> treemap = new TreeMap<>();
        treemap.put(2,1d);
        treemap.put(1,7.2d);
        treemap.put(3,8.2d);
        treemap.put(4,6.2d);
       Set<Map.Entry<Integer,Double>> settreemap = treemap.entrySet();
        System.out.println("cac phan tu co trong settreemap : ");
        System.out.println(settreemap);
        treemap.replace(3, 9.2d);
        treemap.replace(4, 6.2d, 5.2d);
        System.out.println("cac phan tu khi da thay the : ");
        // settreemap = treemap.entrySet();
        System.out.println(settreemap);
    }
}

