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
public class QuanLy_NLD {
    public static void main(String[] args) {
        NguoiLaoDong nld1 ;
        System.out.println("Giao vien: ");
        nld1 = new NLD_GiaoVien();
        nld1.Nhap();
        nld1.Xuat();
        System.out.println("Nhan vien: ");
        nld1 = new NLD_NhanVien();
        nld1.Nhap();
        nld1.Xuat();
    }
}
