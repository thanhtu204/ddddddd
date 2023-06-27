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
public class GiangVien extends Ngay{
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int soGioDay;
    protected int luongThoaThuan;
    
    public GiangVien(){}

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
    protected double ThuNhap(){
        return 0;
    }
    protected void Xuat(){
        System.out.println("- Ho ten: "+this.hoTen);
        super.Xuat();
    }
}
