/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_GiangVien.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachGiangVien implements ICapNhat<GiangVien>{
    private ArrayList<GiangVien> danhSachGV;
    public DanhSachGiangVien(){
        this.danhSachGV = new ArrayList<>();
    }

    public ArrayList<GiangVien> getDanhSachGV() {
        return danhSachGV;
    }

    public void setDanhSachGV(ArrayList<GiangVien> danhSachGV) {
        this.danhSachGV = danhSachGV;
    }
    public void them(GiangVien gv){
        this.danhSachGV.add(gv);
    }
    public void xoa(GiangVien gv){
        int vt = this.danhSachGV.indexOf(gv);
        this.danhSachGV.remove(vt);
    }
    public void xuat(){
        System.out.println("Danh sach giang vien: ");
        for(GiangVien gv: danhSachGV){
            gv.Xuat();
        }
    }
}
