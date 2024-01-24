import java.util.Scanner;

public class giaiptbac2 {
    public static void main(String[] args) {
        double a,b,c,x,delta,x1,x2;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a:");
        a= sc.nextDouble();
        System.out.println("nhap b:");
        b= sc.nextDouble();
        System.out.println("nhap c:");
        c= sc.nextDouble();
        delta= b*b-4*a*c;
        if(delta>0) {
          x1=(-b+Math.sqrt(delta))/(2*a);
          x2=(-b-Math.sqrt(delta))/(2*a);
          System.out.println("pt co 2 nghiem phan biet :"+x1 + "x2"+x2);
        }else if(delta==0){
            x=-b*(2/a);
            System.out.println("phuong trinh co mot nghiem kep:"+x);
        }
        System.out.println("phuong trinh vo nghiem");

    }
}
