/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class XuLiDanhSachHocSinh {
    public static void main(String[] args) {
         DanhSachHS_Interface danhSachHS = new DanhSachHS_Interface();
         danhSachHS.them(new HocSinhCap1("A01", "Nguyen Van 01", "Nam",9, 5, 6));
         danhSachHS.them(new HocSinhCap1("A02", "Le Quang 02", "Nu",8, 5, 4));
         danhSachHS.them(new HocSinhMauGiao("M01", "Tran Van 03", "Nam",3, 1));
         danhSachHS.them(new HocSinhMauGiao("M02", "Do Thi 04", "Nu",4, 6));
         System.out.println("\nDanh sach hoc sinh truoc sap tang");
         for(HocSinh hs:danhSachHS.getDanhSachHS()){
             System.out.println(hs);
         }
         System.out.println("\nDanh sach hoc sinh sau sap tang");
         Collections.sort(danhSachHS.getDanhSachHS());
         for(HocSinh hs:danhSachHS.getDanhSachHS()){
             System.out.println(hs);
         }
         System.out.println("\nDanh sach hoc sinh sau sap tuoi tang");
         Collections.sort(danhSachHS.getDanhSachHS(),HocSinh.compeByTuoi());
         for(HocSinh hs:danhSachHS.getDanhSachHS()){
             System.out.println(hs);
         }
    }
}
   
    
