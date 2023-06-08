/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class XuLyNV {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanvienQL();
        nv1.nhapThongTin();
        nv1.xuatThongtin();
        NhanVien nv2 = new NhanVienHD();
        nv2.nhapThongTin();
        nv2.xuatThongtin();
    }
}
