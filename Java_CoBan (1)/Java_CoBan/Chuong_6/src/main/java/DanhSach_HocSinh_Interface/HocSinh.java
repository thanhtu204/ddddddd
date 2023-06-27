/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

import HocSinh_DanhSach.*;
import java.util.Comparator;
import javacb.duy.chuong_6.*;

/**
 *
 * @author Administrator
 */
public abstract class HocSinh implements Comparable<HocSinh>{
    protected String maHS;
    protected String tenHS;
    protected String phai;
    protected int tuoi;

    public HocSinh(String maHS, String tenHS, String phai,int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
    public abstract String tinhXepLoai();
    
    private String getTen(){
        String ten = this.getTenHS().trim();
        int vt = ten.lastIndexOf(" ");;
        return ten.substring(vt+1);
    }
    @Override
    public int compareTo(HocSinh hs){
        return this.tenHS.compareTo(hs.tenHS);
    }

    @Override
    public String toString() {
        return "MaHS: "+this.maHS+"- Ho ten: "+this.tenHS+"- tuoi: "+this.tuoi;
    }
    public static Comparator<HocSinh> compeByHoTen(){
        return Comparator.comparing(HocSinh::getTenHS);
    }
    public static Comparator<HocSinh> compeByTuoi(){
        return Comparator.comparing(HocSinh::getTuoi);
    }
}
