/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class Sach {
    private String tenSach;
    private double  donGia;
    private int namXuatBan;
    private TacGia nguoi;

    public Sach(String tenSach, double donGia, int namXuatBan, TacGia nguoi) {
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.namXuatBan = namXuatBan;
        this.nguoi = nguoi;
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

    public TacGia getNguoi() {
        return nguoi;
    }

    public void setNguoi(TacGia nguoi) {
        this.nguoi = nguoi;
    }
    public  void xuatTenSach(){
        System.out.println("Sach co ten: "+this.tenSach);
    }
    public  double xuatGiaBanSauGiam(double  x){
        return (1-x/100)*this.donGia;
    }
    public  boolean  cungNamXuatBan(Sach s){
        if(this.namXuatBan==s.namXuatBan){
            return  true;
        }
        return  false;
    }
    
}
