import java.util.Scanner;

public class kitu {
    public static void main(String[] args) {
        String chuoi;
        char kitu;
        Scanner Sc = new Scanner (System.in);
        System.out.println("nhap chuoi  :");
        chuoi = Sc.nextLine();
        System.out.println("ki tu trong chuoi la : ");
         for (int i=0 ;i < chuoi.length(); i++){
            kitu = chuoi.charAt(i);
            System.out.println("ki tu : "+kitu);
         }
    }
}
