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
public class NguoiLaoDong extends NLD_Ngay{
    protected String hoTen;
    protected Ngay ngaySinh;
    protected Ngay ngayVaoLam;
    protected double heSoLuong;
    
    public NguoiLaoDong(){}

    public NguoiLaoDong(String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, double heSoLuong, int day, int month, int year) {
        super(day, month, year);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public Ngay getNgayVaoLam() {
        return ngayVaoLam;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap ho ten: ");
        this.hoTen =s.nextLine();
        System.out.println("- Nhap ngay sinh");
        this.ngaySinh = super.NhapNgay();
        System.out.println("- Nhap ngay vao lam");
        this.ngayVaoLam = super.NhapNgay();
        System.out.print("- Nhap he so luong: ");
        this.heSoLuong =s.nextDouble();
    }
    protected double ThuNhap(){
        return this.heSoLuong * 1490000;
    }
    protected void Xuat(){
        System.out.println("- Ho ten: "+this.hoTen);
        System.out.print("- Ngay sinh: ");
        super.Xuat(this.ngaySinh);
        System.out.print("- Ngay vao lam: ");
        super.Xuat(this.ngayVaoLam);
        System.out.println("- Thu nhap: "+this.ThuNhap());
    }
}
