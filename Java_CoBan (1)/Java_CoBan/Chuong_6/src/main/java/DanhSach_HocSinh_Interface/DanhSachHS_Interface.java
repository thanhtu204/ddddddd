/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachHS_Interface implements ICapNhatDS<HocSinh>{
    private ArrayList<HocSinh> danhSachHS;
    public DanhSachHS_Interface(){
        danhSachHS = new ArrayList<>();
    }

    public ArrayList<HocSinh> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<HocSinh> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    public void them(HocSinh hs){
        this.danhSachHS.add(hs);
    }
    public void xoa(HocSinh hs){
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt);
    }
    public void in(){
        System.out.println("Danh sach hoc sinh: ");
        for(HocSinh hs:danhSachHS){
            hs.inHocSinh();
        }
    }
}
