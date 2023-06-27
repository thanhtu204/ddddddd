/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_GiangVien;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class XuLiGiangVien {
    public static void main(String[] args) {
        DanhSachGiangVien dsgv = new DanhSachGiangVien();
        dsgv.themGV(new GiangVienCoHuu("Duy 01", new Ngay(1, 1, 2000), 19, 200000, 1, 1, 2000, 19));
        dsgv.themGV(new GiangVienCoHuu("Duy 02", new Ngay(2, 1, 2000), 30, 400000, 1, 1, 2000, 19));
        dsgv.themGV(new GiangVienThinhGiang("Duy 03", new Ngay(2, 2, 2001), 12, 300000, 2, 2, 2001));
        
        
        System.out.println("DANH SACH GIANG VIEN TRUOC KHI SORT TANG");
        dsgv.inDanhSachGV();
        System.out.println("-----------------------------------------------------------------------------------------");
        
        Collections.sort(dsgv.getDanhSachGV());
        System.out.println("DANH SACH GIANG VIEN SAU KHI SORT TANG");
        dsgv.inDanhSachGV();
        System.out.println("-----------------------------------------------------------------------------------------");
        
        Collections.sort(dsgv.getDanhSachGV(),Comparator.reverseOrder());
        System.out.println("DANH SACH GIANG VIEN SAU KHI SORT TANG");
        dsgv.inDanhSachGV();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
