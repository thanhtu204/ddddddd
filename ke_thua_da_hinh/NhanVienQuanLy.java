/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ke_thua_da_hinh;

import java.util.Scanner;

/**
 *
 * @author KHOACNTT
 */
public class NhanVienQuanLy extends NhanVien {

    private double luongCB;
    private double phuCapcv;
    private double tienThuong;

    public NhanVienQuanLy() {
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getPhuCapcv() {
        return phuCapcv;
    }

    public void setPhuCapcv(double phuCapcv) {
        this.phuCapcv = phuCapcv;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    /**
     *
     * @return
     */
    @Override
    public double thuNhap() {
        return this.luongCB+this.phuCapcv+super.tienThuong;
    }

    @Override
    public void inThongTin() {

        super.inThongTin();
        System.out.print("-Thu nhập: "+this.thuNhap());
    }

    public NhanVienQuanLy(double luongCB, double phuCapcv, double tienThuong) {
        this.luongCB = luongCB;
        this.phuCapcv = phuCapcv;
        this.tienThuong = tienThuong;
    }

    @Override
    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("nhap luong co ban");
        this.luongCB = s.nextDouble();
        System.out.print("nhap phu cap cong viec: ");
        this.phuCapcv = s.nextDouble();
        System.out.print("nhap tien thuong: ");
        this.tienThuong = s.nextDouble();
    }

}
