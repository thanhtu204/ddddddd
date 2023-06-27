/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NguoiLaoDong;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachNguoiLD {
    private ArrayList<NguoiLaoDong> danhSachNLD;
    public DanhSachNguoiLD(){
        this.danhSachNLD = new ArrayList<>();
    }

    public ArrayList<NguoiLaoDong> getDanhSachNLD() {
        return danhSachNLD;
    }

    public void setDanhSachNLD(ArrayList<NguoiLaoDong> danhSachNLD) {
        this.danhSachNLD = danhSachNLD;
    }
    public void themNLD(NguoiLaoDong nld){
        this.danhSachNLD.add(nld);
    }
    public void inNguoiLaoDong(){
        System.out.println("Danh sach nguoi lao dong");
        for(NguoiLaoDong nld: danhSachNLD){
            nld.Xuat();
        }
    }
}
