/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NhanVien.*;
import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class NhanVien extends Ngay{
    protected String MaNV;
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int tienThuong;

    public NhanVien(){}
    public NhanVien(String MaNV, String hoTen, Ngay ngaySinh, int tienThuong, int day, int month, int year) {
        super(day, month, year);
        this.MaNV = MaNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.tienThuong = tienThuong;
    }


    

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap MaNV: ");
        this.MaNV = s.nextLine();
        System.out.print("- Nhap ho ten: ");
        this.hoTen =s.nextLine();
        super.Nhap();
        System.out.print("- Nhap tien thuong: ");
        this.tienThuong =s.nextInt();   
    }
    protected abstract double ThuNhap();
    protected void xuat(){

        System.out.println("- MaNV: "+this.MaNV);

        System.out.println("- Ho ten: "+this.hoTen);
        super.Xuat();
    }
}
