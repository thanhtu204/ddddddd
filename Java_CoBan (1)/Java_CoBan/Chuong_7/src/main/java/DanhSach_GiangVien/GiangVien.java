/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_GiangVien;

import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class GiangVien extends Ngay implements Comparable<GiangVien>{
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int soGioDay;
    protected int luongThoaThuan;
    
    public GiangVien(){}

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public DanhSach_GiangVien.Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(DanhSach_GiangVien.Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public int getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(int luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public GiangVien(String hoTen, Ngay ngaySinh, int soGioDay, int luongThoaThuan, int day, int month, int year) {
        super(day, month, year);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soGioDay = soGioDay;
        this.luongThoaThuan = luongThoaThuan;
    }
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap ho ten: ");
        this.hoTen =s.nextLine();
        super.Nhap();
        System.out.print("- Nhap so gio day: ");
        this.soGioDay =s.nextInt();
        System.out.print("- Nhap luong thoa thuan: ");
        this.luongThoaThuan =s.nextInt();
    }
    protected abstract double ThuNhap();
    protected void Xuat(){
        System.out.print("- Ho ten: "+this.hoTen+"- Gio day: "+this.soGioDay);
        super.Xuat();
    }
     @Override
    public int compareTo(GiangVien gv){
        String s1=Integer.toString(this.soGioDay);
        String s2=Integer.toString(gv.soGioDay);
        return s1.compareTo(s2);
    }
}
