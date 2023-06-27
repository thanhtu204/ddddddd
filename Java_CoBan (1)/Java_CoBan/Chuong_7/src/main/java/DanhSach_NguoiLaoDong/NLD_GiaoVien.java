/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NguoiLaoDong;

import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NLD_GiaoVien extends NguoiLaoDong{
    private double soGioVuot;
    private double tienGioVuot;
    public NLD_GiaoVien(){}

    public NLD_GiaoVien( String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, double heSoLuong,int soGioVuot, int tienGioVuot) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLuong);
        this.soGioVuot = soGioVuot;
        this.tienGioVuot = tienGioVuot;
    }
    public NLD_GiaoVien(int soGioVuot, int tienGioVuot, String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, double heSoLuong, int day, int month, int year) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLuong, day, month, year);
        this.soGioVuot = soGioVuot;
        this.tienGioVuot = tienGioVuot;
    }

    public double getSoGioVuot() {
        return soGioVuot;
    }

    public void setSoGioVuot(double soGioVuot) {
        this.soGioVuot = soGioVuot;
    }

    public double getTienGioVuot() {
        return tienGioVuot;
    }

    public void setTienGioVuot(double tienGioVuot) {
        this.tienGioVuot = tienGioVuot;
    }
  
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap so gio vuot: ");
        this.soGioVuot = s.nextDouble();   
        System.out.print("- Nhap tien gio vuot: ");
        this.tienGioVuot = s.nextDouble();
    }
    
    public double ThuNhap(){
        double luongCB = super.ThuNhap();
        double tienVuotThang = this.soGioVuot*this.tienGioVuot;
        int soNamGV = 2023 - this.ngayVaoLam.getYear();
        double tienPC = luongCB * (soNamGV/100);
        return (double)luongCB+tienVuotThang+tienPC;
    }
    public void Xuat(){
        super.Xuat();

    }

    @Override
    public int none() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(DanhSach_NguoiLaoDong.NguoiLaoDong arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
