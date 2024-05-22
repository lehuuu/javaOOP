package baikiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class LVH144Person {
        String ten;
        int mssv ;
        long date;
        Scanner sc = new Scanner(System.in);
        public void nhapthongtin(){
          System.out.println("nhap ten :");
          ten = sc.nextLine();
          System.out.println("nhap mssv :");
          mssv = sc.nextInt();
          System.out.println("nhap nam sinh :");
          date = sc.nextLong();
        }
        public void inthongtin(){
            System.out.println("ten la :"+ten);
            System.out.println("mssv la :"+mssv);
            System.out.println("nam sinh la :"+date);
        }
        public static void main(String[] args) {
            LVH144Person person = new LVH144Person();
            Scanner sc = new Scanner(System.in);
            person.nhapthongtin();
            person.inthongtin();
            ArrayList<String> arrlist = new ArrayList<>();

            System.out.println("them thong tin :");
            // System.out.println(""+n);
           int n = sc.nextInt();
             arrlist.add("null");
             System.out.println("xoa thong tin :");
             n=sc.nextInt();
             arrlist.remove(n);
             arrlist.get(n);
             System.out.println(arrlist);
        }

        
    }

