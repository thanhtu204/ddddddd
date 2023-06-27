/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5_2;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private NhaSanXuat nhaSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public Phim(String tenPhim, int namSanXuat, NhaSanXuat nhaSanXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.nhaSanXuat = nhaSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    
    public String xuatTenHangPhim(){
        return getTenPhim();
    }
    
    public double giaBanSauKhuyenMai(double x){
        return this.giaVe * (1 - x/100);
    }
    
    public boolean xuatGiaReHon(Phim p2){
        if(this.giaVe < p2.giaVe)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Phim other = (Phim) obj;
        if (!Objects.equals(this.ngayChieu.getDay(), other.ngayChieu.getDay())) {
            return false;
        }
        if (!Objects.equals(this.ngayChieu.getMonth(), other.ngayChieu.getMonth())) {
            return false;
        }
        if (!Objects.equals(this.ngayChieu.getYear(), other.ngayChieu.getYear())) {
            return false;
        }
        return true;
    }

     
    
    public boolean kiemTraNgayChieuGiongNhau(Phim p2){
        return equals(p2);
    }

}
