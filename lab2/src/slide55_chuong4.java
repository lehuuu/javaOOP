import java.util.HashSet;
import java.util.Scanner;

public class slide55_chuong4 {
    public static void main(String[] args) {
        int n;
        HashSet<Integer> hashset = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashset.add(0);
        hashset.add(1);
        hashset.add(2);
        hashset.add(4);
        hashset.add(8);
        hashset.add(6);
        System.out.println("cach phan tu trong hashset : ");
        System.out.println(hashset);
        System.out.println("nhap phan tu them : ");
        n = sc.nextInt();
        if(!hashset.contains(n)){
            hashset.add(n);
            System.out.println(" thanh cong : ");
            System.out.println(" cac phan tu trong hashset khi them : ");
            System.out.println(hashset);
        } else {
            System.out.println("phan tu " + n + " da ton tai" );
        }
    }
}
