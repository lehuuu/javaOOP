package shapes;

import java.util.Scanner;

public class person {
    public String hoten,gioitinh;
    public int tuoi;
    public person(){
        hoten= "le van huu";
        gioitinh=" nam ";
        tuoi=19;
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten : ");
        hoten = sc.nextLine();
        System.out.println("nhap gioi tinh : ");
        gioitinh = sc.nextLine();
        System.out.println("nhap tuoi : ");
        tuoi = sc.nextInt();
    }
    public void inthongtin(){
        System.out.println("ho va ten : " +hoten);
        System.out.println("gioi tinh : " +gioitinh);
        System.out.println("tuoi : "+tuoi);
    }
    public void inthongtin(String ten , int tuoi , String gioitinh){
        System.out.println(ten + "-" + tuoi + "-" +gioitinh);
    }
}
