/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DanhSach;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachHocSinh {
    private ArrayList<HocSinh> danhSachHS;
    public DanhSachHocSinh(){
        this.danhSachHS = new ArrayList<>();
    }
    public DanhSachHocSinh(ArrayList<HocSinh> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }

    public ArrayList<HocSinh> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<HocSinh> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    public void themHS(HocSinh hs){
        this.danhSachHS.add(hs);
    }
    public void xoaHS(HocSinh hs){
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt);
    }
    public void inDanhSachHS(){
        System.out.println("Danh sach hoc sinh: ");
        for(HocSinh hs:danhSachHS){
            hs.inHocSinh();
        }
    }
}
