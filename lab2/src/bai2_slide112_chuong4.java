import java.util.LinkedList;
import java.util.Scanner;

public class bai2_slide112_chuong4 {
    public static void main(String[] args) {
        int n , nguyen , tong = 0, chan = 0, tbc ;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkint = new LinkedList<>();
        System.out.println("nhap os luong phan tu : ");
        n= sc.nextInt();
        for (int i=0;i<n;i++){
        System.out.println("nhap vao so luong phan tu thu " + i + ":");
        nguyen = sc.nextInt();
        linkint.add(nguyen);
    }
    for(int i=0;i<n;i++){
      if(linkint.get(i)%2==0){
        tong +=linkint.get(i);
        chan++;
      }
    }
   tbc = tong / chan;
    System.out.println("tbc la :" + tbc);
}
}
