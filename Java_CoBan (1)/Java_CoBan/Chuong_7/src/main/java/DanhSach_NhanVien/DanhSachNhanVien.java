/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NhanVien;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;
    public DanhSachNhanVien(){
        this.danhSachNhanVien = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    public void themNV(NhanVien nv){
        danhSachNhanVien.add(nv);
    }
     public void xoaNV(NhanVien nv){
        int vt = danhSachNhanVien.indexOf(nv);
        danhSachNhanVien.remove(vt);
    }
     public void inDanhSachNV(){
         System.out.println("Danh sach nhan vien: ");
         for(NhanVien nv : danhSachNhanVien){
             nv.xuat();
         }
     }     
}
