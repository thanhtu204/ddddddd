/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GiangVienThinhGiang extends GiangVien{

    public GiangVienThinhGiang(){}
    public GiangVienThinhGiang(String hoTen, Ngay ngaySinh, int soGioDay, int luongThoaThuan, int day, int month, int year) {
        super(hoTen, ngaySinh, soGioDay, luongThoaThuan, day, month, year);
    }
    public void Nhap(){
        super.Nhap();
    }
    public double ThuNhap(){
        return super.luongThoaThuan * super.soGioDay;
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("- Thu Nhap: "+this.ThuNhap());
    }
}
