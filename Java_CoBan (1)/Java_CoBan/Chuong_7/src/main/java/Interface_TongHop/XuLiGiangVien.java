/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_GiangVien.*;

/**
 *
 * @author Administrator
 */
public class XuLiGiangVien {
    public static void main(String[] args) {
        DanhSachGiangVien dsgv = new DanhSachGiangVien();
        dsgv.them(new GiangVienCoHuu("Duy 01", new Ngay(1, 1, 2000), 20, 200000, 1, 1, 2000, 19));
        dsgv.them(new GiangVienCoHuu("Duy 02", new Ngay(2, 1, 2000), 20, 400000, 1, 1, 2000, 19));
        dsgv.them(new GiangVienThinhGiang("Duy 03", new Ngay(2, 2, 2001), 20, 300000, 2, 2, 2001));
        dsgv.xuat();
    }
}
