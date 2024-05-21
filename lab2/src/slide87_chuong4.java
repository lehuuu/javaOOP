import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide87_chuong4 {
    public static void main(String[] args) {
        HashMap<String , String > hash = new HashMap<>();
        hash.put("csdl" , "co so du lieu ");
        hash.put("c++" , "c++");
        hash.put("C#" , "C sharp");
        hash.put("java" , "java");
        Set<Map.Entry<String,String>> sethash = hash.entrySet();
        System.out.println("cac entry co trong sethash : ");
        System.out.println(sethash);
    }
}
