/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NhanVien;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class XuLiNhanVien {
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        dsnv.themNV(new NhanVienHopDong("A01", "Duy 01", new Ngay(1, 1, 2000), 150000, 1,1 , 2000, 200000, 30));
        dsnv.themNV(new NhanVienHopDong("A02", "Duy 09", new Ngay(1, 2, 2000), 190000, 1,2 , 2000, 250000, 30));
        dsnv.themNV(new NhanVienQuanLy("B01", "Duy 03", new Ngay(1, 9, 2001), 500000, 1, 9, 2001, 9000000, 1500000));
        
        System.out.println("DANH SACH NHAN VIEN TRUOC KHI SORT TANG");
        dsnv.inDanhSachNV();
        System.out.println("-----------------------------------------------------------------------------------------");
        
        Collections.sort(dsnv.getDanhSachNhanVien());
        System.out.println("DANH SACH NHAN VIEN SAU KHI SORT TANG");
        dsnv.inDanhSachNV();
        System.out.println("-----------------------------------------------------------------------------------------");
        
        Collections.sort(dsnv.getDanhSachNhanVien(),Comparator.reverseOrder());
        System.out.println("DANH SACH NHAN VIEN SAU KHI SORT TANG");
        dsnv.inDanhSachNV();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
