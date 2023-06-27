/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5;

/**
 *
 * @author Administrator
 */
public class XuLiSach {
    public static void main(String[] args) {
        Ngay n1 = new Ngay(1, 1, 2000);
        TacGia tg1 = new TacGia("Nguyen Quang Hung", n1);
        Sach s1 = new Sach("Lap trinh CSDL", 120000, 2018, tg1);
        
        Sach s2 = new Sach("Thiet ke web", 80000, 2020, new TacGia("Nguyen Huy", new Ngay(2, 5, 1980)));
        Sach s3 = new Sach("Lap trinh WIndows", 70000, 2018, new TacGia("Tran Anh Ngoc", new Ngay(25, 8, 1995)));
        
        s1.xuatTenSach();
        s2.xuatTenSach();
        s3.xuatTenSach();
        System.out.println("Gia giam s1: "+s1.xuatGiaGiam(10));
        System.out.println("Gia giam s2: "+s2.xuatGiaGiam(20));
        System.out.println("Gia giam s3: "+s3.xuatGiaGiam(30));
        System.out.println("s1 cung nam s2? "+s1.kiemTraCungNamXB(s2));
        System.out.println("s1 cung nam s3? "+s1.kiemTraCungNamXB(s3));
        System.out.println("s2 cung nam s3? "+s2.kiemTraCungNamXB(s3));
    }
}
