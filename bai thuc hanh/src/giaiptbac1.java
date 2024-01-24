import java.util.Scanner;

public class giaiptbac1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap a:");
        a=sc.nextDouble();
        System.out.print("nhap b:");
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.print("pt vo so nghiem");
            }else {
            System.out.print("pt vo nghiem");
        }
    }else {
         x = -b / a;
        System.out.print("nghiem cua phuong trinh la :"+ x);

    }
  //  scanner.close();
}
}
