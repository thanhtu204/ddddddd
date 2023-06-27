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
public class NhanVienQuanLy extends NhanVien{
    private int luongCoBan;
    private int phuCapCV;

    public NhanVienQuanLy(){}
    public NhanVienQuanLy(int luongCoBan, int phuCapCV, String MaNV, String hoTen, Ngay ngaySinh, int tienThuong, int day, int month, int year) {
        super(MaNV, hoTen, ngaySinh, tienThuong, day, month, year);
        this.luongCoBan = luongCoBan;
        this.phuCapCV = phuCapCV;
    }
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap tien luong: ");
        this.luongCoBan = s.nextInt();
        System.out.print("- Nhap phu cap: ");
        this.phuCapCV = s.nextInt();
    }
    public double ThuNhap(){
       return this.luongCoBan + this.phuCapCV + super.tienThuong;
    }
    public void xuat(){
        super.xuat();
        System.out.println("-Thu nhap: "+this.ThuNhap());
    }
}
