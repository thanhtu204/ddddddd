/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NhanVien;

import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVienQuanLy extends NhanVien{
    private int luongCoBan;
    private int phuCapCV;

    public NhanVienQuanLy(){}
    public NhanVienQuanLy(String MaNV, String hoTen, Ngay ngaySinh, int tienThuong, int day, int month, int year,int luongCoBan, int phuCapCV) {
        super(MaNV, hoTen, ngaySinh, tienThuong, day, month, year);
        this.luongCoBan = luongCoBan;
        this.phuCapCV = phuCapCV;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap tien luong: ");
        this.luongCoBan = s.nextInt();
        System.out.print("- Nhap phu cap: ");
        this.phuCapCV = s.nextInt();
    }
    @Override
    public double ThuNhap(){
       return this.luongCoBan + this.phuCapCV + super.tienThuong;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("-Thu nhap: "+this.ThuNhap()+"\n");
    }
}
