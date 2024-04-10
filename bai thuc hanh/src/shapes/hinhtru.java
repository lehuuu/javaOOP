package shapes;

import java.util.Scanner;

public class hinhtru extends hinhtron{
    public float chieucao;
    public hinhtru(){
        ten= " hinh tru ";
    }
    public void nhapchieucao(){
        nhapbankinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu cao :");
        chieucao = sc.nextFloat();

    }
    
    
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
        
    }
   
}
