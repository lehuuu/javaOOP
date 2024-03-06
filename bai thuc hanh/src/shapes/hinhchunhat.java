package shapes;

import java.util.Scanner;

public class hinhchunhat {
    float dai,rong,cv,dt;
    public void nhapchieudaichieurong(){
        System.out.println("chieu dai : ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        System.out.println("chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinhcvdt(){
        cv = 2*(dai+rong);
        dt = dai*rong;
    }
    public void inthongtin(){
        System.out.println("chu vi la : "+cv);
        System.out.println("dien tich la : "+dt);
    }
    
}
