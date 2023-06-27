/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5_2;

/**
 *
 * @author Administrator
 */
public class XuLiPhim {
    public static void main(String[] args) {
        Phim p1 = new Phim("Bong Dung Muon Khoc", 2005, new NhaSanXuat("Dat Viet", "Viet Nam"), 75000, new Ngay(0,0,0));
        Phim p2 = new Phim("Ngay Tan The", 2005, new NhaSanXuat("Univer", "My"), 65000, new Ngay(21, 5, 2008));
        Phim p3 = new Phim("KingMan", 2004, new NhaSanXuat("Alatt", "Anh"), 55000, new Ngay(0,0,0));
        Phim p4 = new Phim("Tay Du Ki", 2005, new NhaSanXuat("TQ", "Trung Quoc"), 45000, new Ngay(21, 5, 2010));
        
        
        String tenPhim;
        tenPhim = p1.xuatTenHangPhim();
        System.out.println("Ten phim: "+tenPhim);
        
        System.out.println("Gia ve 1: "+p1.giaBanSauKhuyenMai(10));
        System.out.println("Gia ve 2: "+p2.giaBanSauKhuyenMai(5));
        System.out.println("Gia ve 3: "+p3.giaBanSauKhuyenMai(10));
        System.out.println("Gia ve 4: "+p4.giaBanSauKhuyenMai(20));
        
        System.out.println("P1 re hon P2? "+p1.xuatGiaReHon(p2));
        System.out.println("P2 re hon P1? "+p2.xuatGiaReHon(p1));
        
        System.out.println("Giong ngay: "+p1.kiemTraNgayChieuGiongNhau(p2));
        System.out.println("Giong ngay: "+p1.kiemTraNgayChieuGiongNhau(p3));
        
    }
    
}
