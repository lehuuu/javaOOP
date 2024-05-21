import java.util.ArrayList;
import java.util.Scanner;

public class bai1_slide111_chuong4 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrlish = new ArrayList<>();
        System.out.println("nhap so luong phan tu : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("nhap phan tu thu " + i + ":");
           int number = sc.nextInt();
            arrlish.add(number);
        }
    int max = arrlish.get(0);
    for (int i=1;i<arrlish.size();i++){
        if (arrlish.get(i).compareTo(max)>0){
        max = arrlish.get(i);
    }
  }
    System.out.println("phan tu lon nhat la : " +max);
    
}
}
