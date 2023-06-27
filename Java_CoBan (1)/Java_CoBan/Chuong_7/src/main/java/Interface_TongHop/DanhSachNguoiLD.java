/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NguoiLaoDong.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachNguoiLD implements ICapNhat<NguoiLaoDong>,IXuLyNguoiLaoDong{
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
    public void them(NguoiLaoDong nld){
        this.danhSachNLD.add(nld);
    }
    public void xoa(NguoiLaoDong nld){
        int vt = this.danhSachNLD.indexOf(nld);
        this.danhSachNLD.remove(vt);
    }
    public void xuat(){
        System.out.println("Danh sach nguoi lao dong");
        for(NguoiLaoDong nld: danhSachNLD){
            nld.Xuat();
        }
    }
    public void tongLuong(){
        double tongLuong = 0;
        for(NguoiLaoDong nld: danhSachNLD){
            tongLuong+=nld.ThuNhap();
        }
        System.out.println("Tong luong nguoi lao dong: "+tongLuong);
    }
    public void demNguoiLaoDong(){
        int soNguoi = 0;
        for(NguoiLaoDong nld: danhSachNLD){
            soNguoi++;
        }
        System.out.println("tong so nguoi lao dong: "+soNguoi);
    }
}
