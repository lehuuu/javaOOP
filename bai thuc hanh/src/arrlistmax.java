import java.util.ArrayList;
import java.util.Scanner;

public class arrlistmax {
    public static void main(String[] args) {
        ArrayList<Integer> arrlistint = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap phan tu : ");
        n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu thu " +i+ "la :");
            n= sc.nextInt();
            arrlistint.add(n);
        }
        int max = arrlistint.get(0);
        for(int i=1;i<arrlistint.size();i++){
        if(arrlistint.get(i).compareTo(max)>0){
            max = arrlistint.get(i);
        }
        }
          System.out.println("phan tu lon nhat la : "+max);
    }
}
