/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_7;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanVien {
    public static void main(String[] args) {
        Ngay s;
        System.out.println("Nhan vien quan ly:");
        s = new NhanVienQuanLy();
        s.Nhap();
        System.out.println("Nhan vien quan ly:");
        s.Xuat();
        System.out.println("Nhan vien hop dong:");
        s = new NhanVienHopDong();
        s.Nhap();
        System.out.println("Nhan vien hop dong:");
        s.Xuat();
    }
}
