
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
public abstract class NhanVien {

    protected String maNV;
    protected String hoTen;
    protected Ngay ngaySinh;
    protected double tienThuong;

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
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

    public void xuatThongtin() {
        System.out.print("ho ten: " + this.hoTen  +"-tien thuong: "+this.tienThuong);
    }

    public abstract double thuNhap();

    public void nhapThongTin() {
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maNV = S.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = S.nextLine();
        System.out.print("Nhap tien thuong: ");
        this.tienThuong = S.nextDouble();
         

    }

    
}
