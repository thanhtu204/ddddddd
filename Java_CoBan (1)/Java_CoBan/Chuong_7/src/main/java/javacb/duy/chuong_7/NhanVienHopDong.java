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
public class NhanVienHopDong extends NhanVien{
    private int luongNgay;
    private int soNgayLV;
    public NhanVienHopDong(){}

    public NhanVienHopDong(int luongNgay, int soNgayLV, String MaNV, String hoTen, Ngay ngaySinh, int tienThuong, int day, int month, int year) {
        super(MaNV, hoTen, ngaySinh, tienThuong, day, month, year);
        this.luongNgay = luongNgay;
        this.soNgayLV = soNgayLV;
    }
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap luong ngay: ");
        this.luongNgay = s.nextInt();
        System.out.print("- Nhap so ngay lam viec: ");
        this.soNgayLV = s.nextInt();
    }
    public double ThuNhap(){
       return this.luongNgay * this.soNgayLV + super.tienThuong;
    }
    public void xuat(){
        super.xuat();
        System.out.println("-Thu nhap: "+this.ThuNhap());
    }
}
