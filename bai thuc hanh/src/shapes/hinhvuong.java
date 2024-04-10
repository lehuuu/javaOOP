package shapes;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
   
    public hinhvuong(){
        ten = "hinhvuong";
    }
    public void nhapcanh(){
        System.out.print("nhap canh :");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
    // public void inthongtinhinhvuong(){
    //     System.out.println("canh cua hinh vuong la : " +dai);
    // }

}
