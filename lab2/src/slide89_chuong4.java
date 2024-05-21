import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide89_chuong4 {
    public static void main(String[] args) {
        HashMap<String , String> mapcity = new HashMap<>();
        mapcity.put("tb","thai binh");
        mapcity.put("nd","nam dinh ");
        mapcity.put("nd","nam sinh");
        mapcity.put("hn","ha noi");
        System.out.println("danh sach thanh pho :");
        Set<Map.Entry<String , String>> setcity = mapcity.entrySet();
        System.out.println(setcity);
        System.out.println("tb" +mapcity.get("tb"));
        System.out.println("qn"+mapcity.get("qn"));
        if (mapcity.containsValue("ha noi")){
            System.out.println("co thu do ha noi trong mapcity :");
        }

    }
}
