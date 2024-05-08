package chuong4;

import java.util.Scanner;

public class student {
    public String fullname;
    public int age;
    public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap ten ");
    fullname = sc.nextLine();
    System.out.println("nhap tuoi ");
    age=sc.nextInt();
    }
    public void inthongtin(){
        System.out.println("ten : "+fullname );
        System.out.println("tuoi : "+age);
    }
}

