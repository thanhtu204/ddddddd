/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

import HocSinh_DanhSach.*;
import javacb.duy.chuong_6.*;

/**
 *
 * @author Administrator
 */
public class HocSinhCap1 extends HocSinh implements IHocSinh{
    private double diemToan;
    private double diemVan;

    public HocSinhCap1(String maHS, String tenHS, String phai,int tuoi,double diemToan, double diemVan) {
        super(maHS, tenHS, phai,tuoi);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    @Override
    public String tinhXepLoai(){
        String a="Dat";
        String b="Khong Dat";
        String result = this.tinhTrungBinh()>=5? a:b;
        return result;
    }

    @Override
    public double tinhTrungBinh(){
        return (double)(this.diemToan+this.diemVan)/2;
    }

    @Override
    public void inHocSinh() {
        super.inHocSinh();
        System.out.println(", Diem tb: "+this.tinhTrungBinh()+", xep loai: "+this.tinhXepLoai());
    }

}
