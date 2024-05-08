package chuong4;

import java.util.ArrayList;

public class color {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        colors.add("orange");
        colors.remove("green");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
