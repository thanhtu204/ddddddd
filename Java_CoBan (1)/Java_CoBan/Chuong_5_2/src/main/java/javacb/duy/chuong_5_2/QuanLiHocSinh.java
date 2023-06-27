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
public class QuanLiHocSinh {
    public static void main(String[] args) {
        HocSinh h1 = new HocSinh("A01", "Duong Duy 01", new LopHoc("Lop 01", new Khoa("Khoa 01", "TH.HCM 1")), 9, 9.5f, new Ngay(1, 1, 2000));
        HocSinh h2 = new HocSinh("A02", "Duong Duy 02", new LopHoc("Lop 02", new Khoa("Khoa 02", "TH.HCM 2")), 6, 3.5f, new Ngay(1, 1, 2000));
        HocSinh h3 = new HocSinh("A03", "Duong Duy 03", new LopHoc("Lop 03", new Khoa("Khoa 03", "TH.HCM 3")), 7, 8.0f, new Ngay(2, 1, 2000));
        
        System.out.println("Ten khoa cua h1: "+h1.xuatTenKhoa());
        System.out.println("Ten khoa cua h2: "+h2.xuatTenKhoa());
        System.out.println("Ten khoa cua h3: "+h3.xuatTenKhoa());
        
        System.out.println("Diem tb cua h1: "+(double)h1.tinhTrungBinh());
        System.out.println("Xep loai cua h1: "+h1.tinhXepLoai());
        System.out.println("Diem tb cua h2: "+(double)h2.tinhTrungBinh());
        System.out.println("Xep loai cua h2: "+h2.tinhXepLoai());
        System.out.println("Diem tb cua h3: "+(double)h3.tinhTrungBinh());
        System.out.println("Xep loai cua h3: "+h3.tinhXepLoai());
        
        System.out.println("h1 trung ngay sinh h2? "+h1.kiemTraNgaySinhGiongNhau(h2));
        System.out.println("h1 trung ngay sinh h3? "+h1.kiemTraNgaySinhGiongNhau(h3));
        System.out.println("h2 trung ngay sinh h3? "+h2.kiemTraNgaySinhGiongNhau(h3));
    }
}
