/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NhanVien.*;

/**
 *
 * @author Administrator
 */
public class XuLiNhanVien {
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        dsnv.them(new NhanVienHopDong("A01", "Duy 01", new Ngay(1, 1, 2000), 150000, 1,1 , 2000, 200000, 30));
        dsnv.them(new NhanVienHopDong("A02", "Duy 02", new Ngay(1, 2, 2000), 190000, 1,2 , 2000, 250000, 30));
        dsnv.them(new NhanVienQuanLy("B01", "Duy 03", new Ngay(1, 9, 2001), 500000, 1, 9, 2001, 9000000, 1500000));
        dsnv.xuat();
    }
}
