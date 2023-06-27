/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5;

/**
 *
 * @author Administrator
 */
public class Sach {
    private String tenSach;
    private double donGia;
    private int namXuatBan;
    private TacGia nguoiViet;

    public Sach(String tenSach, double donGia, int namXuatBan, TacGia nguoiViet) {
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.namXuatBan = namXuatBan;
        this.nguoiViet = nguoiViet;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getNguoiViet() {
        return nguoiViet;
    }

    public void setNguoiViet(TacGia nguoiViet) {
        this.nguoiViet = nguoiViet;
    }
    public void xuatTenSach(){
        System.out.println("Ten sach la: "+ this.tenSach);
    }
    public double xuatGiaGiam(double x){
        return this.donGia * (1 - x/100);
    }
    public boolean kiemTraCungNamXB(Sach s){
        if(this.namXuatBan == s.namXuatBan)
            return true;
        return false;
    }
}
