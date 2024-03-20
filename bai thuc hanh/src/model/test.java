package model;

import model.util.configs;

public class test {
    public static void main(String[] args) {
        
    
    nvfulltime sep = new nvfulltime("le sep");
    "sep".chucvu(configs.nv_sep);
    nvfulltime lelinh = new nvfulltime("le linh");
    nvfulltime nguyenlinh = new nvfulltime("nguyen linh", 20);
    nvpartime pt = new nvpartime("le huu", 200);
        sep.tinhLuong();
        lelinh.tinhLuong();
        nguyenlinh.tinhLuong();
        pt.tinhLuong(); 

        sep.xuatThongTin();
        lelinh.xuatThongTin();
        nguyenlinh.xuatThongTin();
        pt.xuatThongTin();
    }
}

