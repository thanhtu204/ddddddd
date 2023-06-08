
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
public class NhanVienHD extends NhanVien{
    private double  luongNgay;
    private double soNgayLamViec;

    public NhanVienHD() {
    }

    public double getLuongNgay() {
        return luongNgay;
    }

    public void setLuongNgay(double luongNgay) {
        this.luongNgay = luongNgay;
    }

    public double getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(double soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }
   

    @Override
    public double thuNhap() {
        return (this.luongNgay + this.soNgayLamViec)*this.tienThuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
          Scanner s = new Scanner(System.in);
        super.nhapThongTin(); 
        System.out.println("Nhap luong ngay : ");
        this.luongNgay=s.nextDouble();
        System.out.println("Nhap so ngay lam viec : ");
        this.soNgayLamViec=s.nextDouble();
    }

    @Override
    public void xuatThongtin() {
        super.xuatThongtin(); //To change body of generated methods, choose Tools | Templates.
          System.out.print("-thu nhap"+thuNhap());
    }
    
}
