package chuong4.lists;

import java.util.ArrayList;
import java.util.Scanner;

import chuong4.student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<student> arrlist = new ArrayList<student>();
        for(int i=0;i<3;i++){
            student st = new student();
            st.nhapthongtin();
            arrlist.add(st);
        }
        for(int i=0;i<arrlist.size();i++){
         arrlist.get(i).inthongtin();
        //  arrlist.remove(1);
        }
        }
        // arrlist.remove(1);
        // System.out.println(arrlist.get(1));
        // System.out.println(arrlist.size());
    }
    

