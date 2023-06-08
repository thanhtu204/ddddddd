
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
public class NhanvienQL extends NhanVien{

    private double  luongcb;
    private double phucapcv;

  
    public NhanvienQL() {
    }

    public String getMaNV() {
        return maNV;
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

    @Override
    public void xuatThongtin() {
        super.xuatThongtin(); 
        System.out.print("-thu nhap"+thuNhap());
    }

    @Override
    public void setTienThuong(double tienThuong) {
        super.setTienThuong(tienThuong); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTienThuong() {
        return super.getTienThuong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        super.nhapThongTin(); 
        System.out.println("Nhap luong co ban : ");
        this.luongcb=s.nextDouble();
        System.out.println("Nhap phu cap cong viec : ");
        this.luongcb=s.nextDouble();
    }

    @Override
    public double thuNhap() {
        return (this.luongcb + this.phucapcv)*this.tienThuong;
    }
    
}
