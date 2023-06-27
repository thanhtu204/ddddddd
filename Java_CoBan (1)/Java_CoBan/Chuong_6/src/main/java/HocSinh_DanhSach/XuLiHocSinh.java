/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DanhSach;

/**
 *
 * @author Administrator
 */
public class XuLiHocSinh {
    public static void main(String[] args) {
        DanhSachHocSinh dshs = new DanhSachHocSinh();
        dshs.themHS(new HocSinhCap1("A01", "Duy Duong 01", "Nam", 5, 4));
        dshs.themHS(new HocSinhCap2("B01", "Nguyen Thi A", "Nu", 9,8, 7,9));
        dshs.themHS(new HocSinhCap1("A02", "Duy Duong 02", "Nam", 5, 9));
        System.out.println("Danh sach truoc xoa:");
        dshs.inDanhSachHS();
        System.out.println("Danh sach sau xoa:");
        HocSinh hs = dshs.getDanhSachHS().get(1);
        dshs.xoaHS(hs);
        dshs.inDanhSachHS();
    }
}
