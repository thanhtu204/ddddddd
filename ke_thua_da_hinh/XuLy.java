/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ke_thua_da_hinh;

import java.util.Collections;




/**
 *
 * @author KHOACNTT
 */
public class XuLy {
    public static void main(String[] args) {
       
       NhanVien nv1 = new NhanVienQuanLy();
       nv1.nhapThongTin();
       nv1.inThongTin();
       NhanVien nv2 = new NhanVienQuanLy();
        nv2.nhapThongTin();
        nv2.inThongTin();
        
        System.out.print(nv1.getHoTen().equals(nv2.getHoTen()));
       
    }
}
