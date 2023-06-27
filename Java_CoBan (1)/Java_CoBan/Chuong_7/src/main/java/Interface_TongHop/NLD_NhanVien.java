/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NguoiLaoDong.*;
import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NLD_NhanVien extends NguoiLaoDong{
    private String loaiNV;
    public NLD_NhanVien(){}

public NLD_NhanVien(String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, double heSoLuong,String loaiNV) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLuong);
        this.loaiNV = loaiNV;
    }

    public NLD_NhanVien(String loaiNV, String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, double heSoLuong, int day, int month, int year) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLuong, day, month, year);
        this.loaiNV = loaiNV;
    }
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap loai NV: ");
        this.loaiNV = s.nextLine();   
    }
    
    public double ThuNhap(){
        if(this.loaiNV.equalsIgnoreCase("A")){
            double thuNhap = (double)(super.ThuNhap()* 2f);
            return thuNhap;
        }
        else if(this.loaiNV.equalsIgnoreCase("B")){
            double thuNhap = (double)(super.ThuNhap() * 1.8f);
            return thuNhap;
        }
        double thuNhap = (double)(super.ThuNhap() * 1.5f);
        return thuNhap;
    }
    public void Xuat(){
        super.Xuat();

    }
}
