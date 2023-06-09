
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KHOACNTT
 */
public abstract class NguoiLaoDong {

    protected String hoTen;
    protected LocalDate ngaySinh;
    protected double heSoLuong;
    protected LocalDate ngayVaolam;

   

    

    public NguoiLaoDong() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayVaolam() {
        return ngayVaolam;
    }

    public void setNgayVaolam(LocalDate ngayVaolam) {
        this.ngayVaolam = ngayVaolam;
    }

  

    

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhapThongTin() {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = s.nextLine();
        System.out.print("Nhap ngay sinh co dang: yyyy-mm-dd: ");
        String ns=s.nextLine();
        this.ngaySinh=LocalDate.parse(ns);
        System.out.print("Nhap he so luong: ");
        this.heSoLuong = s.nextDouble();
        System.out.print("Nhap ngay vao lam co dang: yyyy-mm-dd");
        String nvl=s.nextLine();
        this.ngayVaolam=LocalDate.parse(nvl);
    }

    public void xuatThongTin() {
        System.out.print("Ho ten: " + this.hoTen + "-Ngay sinh: " + this.ngaySinh);
    }

    public abstract double ThuNhap();

    public double tienLuongCB() {
        return this.heSoLuong * 150000;
    }
}
