package shapes;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    float dai,rong;
    public hinhchunhat(){
        ten = "hinh chu nhat";
    }
    public void nhapchieudaichieurong(){
        System.out.print("chieu dai : ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        System.out.print("chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2*(dai+rong);
    }
        public void tinhdientich(){

    
        dientich = dai*rong;
    }
    // public void inthongtin(){
    //     System.out.println("chu vi la : "+cv);
    //     System.out.println("dien tich la : "+dt);
    // }
    
}
