package shapes;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
      public float r  ;
    public hinhtron(){
        ten = "hinh tron";
    }
    
    public void nhapbankinh (){
        System.out.println("r = ");
        Scanner Sc = new Scanner(System.in);
        r = Sc.nextFloat();
        
    }
    public void tinhchuvi (){

        chuvi = 2 * PI * r;
    }
    public void tinhdientich(){
  
        dientich = PI * r * r;
    }

}

