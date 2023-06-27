/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DanhSach;

import javacb.duy.chuong_6.*;

/**
 *
 * @author Administrator
 */
public abstract class HocSinh {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinh(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }
    
    public void inHocSinh(){
        System.out.print("Ma hs: "+this.maHS+" - Ten: "+this.tenHS+" - Phai: "+this.phai);
    }
    public abstract double tinhTrungBinh();
    public abstract String tinhXepLoai();
}
