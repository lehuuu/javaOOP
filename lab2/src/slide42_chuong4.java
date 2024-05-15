import java.util.LinkedList;
import java.util.Scanner;

public class slide42_chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("thang 1 ");
        list.add("thang 2 ");
        list.add("thang 3 ");
        list.add("thang 4 ");
        list.add("thang 5 ");
        list.add("thang 6 ");
        list.add("thang 7 ");
        list.add("thang 8 ");
        list.add("thang 9 ");
        list.add("thang 10 ");
        list.add("thang 11 ");
        list.add("thang 12 ");
        System.out.println(" nhap gia tri can lay : ");
        int index = sc.nextInt();
        if (index <0 || (index>list.size()-1)){
        System.out.println("chi so can lay phai > 0 and < " + (list.size()-1));
        } else {
            String note = list.get(index);
            System.out.println("phan tu thu "+ index +"trong list la : " + note);
        }
        String firstnote = list.getFirst();
        String lastnote = list.getLast();
        System.out.println(" phan tu dau tien trong danh sach la : " +firstnote );
        System.out.println("phan tu cuoi cung trong danh sach la : " +lastnote);
    }
}
