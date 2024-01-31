import java.util.Scanner;

public class tinhtongsochan {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        int n;
        double tong;
        do {
        System.out.println("nhap so phan tu cua mang :");
        n = Sc.nextInt();
       } while (n < 0);
     int A[] = new int[n];
      System.out.println("nhap phan tu cho mang ");
      for ( int i = 0; i < n; i++){
        System.out.println("nhap so phan tu :" +i +":");
        A[i] = Sc.nextInt();
      }
       tong = 0;
      for (int i = 0 ; i < n; i++ )
       if (A[i] % 2 ==0 ) {
        tong+= A[i];
       }
       System.out.println("tong:"+tong);
      } 
}