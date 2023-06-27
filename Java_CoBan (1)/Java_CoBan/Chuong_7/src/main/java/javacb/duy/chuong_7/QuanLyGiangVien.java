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
public class QuanLyGiangVien {
    public static void main(String[] args) {
        GiangVien gV1;
        gV1 = new GiangVienCoHuu();
        System.out.println("Giang vien co huu: ");
        gV1.Nhap();
        gV1.Xuat();
        gV1 = new GiangVienThinhGiang();
        System.out.println("Giang vien thinh giang: ");
        gV1.Nhap();
        gV1.Xuat();
    }
}
