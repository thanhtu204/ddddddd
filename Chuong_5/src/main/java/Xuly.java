/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class Xuly {
    public static void main(String[] args) {
       Sach s1= new Sach("Lap trinh Java", 120000, 2018, new TacGia("Huynh Thanh Tu", new Ngay(10,5, 1934)));
       Sach s2= new Sach("HTVS-099", 340000, 2012, new TacGia("Yuakami", new Ngay(10,5, 1998)));
       
       Sach s3= new Sach("POPS-334", 630000, 2018, new TacGia("fukada", new Ngay(10,5, 1997)));
       s1.xuatTenSach();
           s2.xuatTenSach();
               s3.xuatTenSach();
               System.out.println(s1.xuatGiaBanSauGiam(10));
                  System.out.println(s2.xuatGiaBanSauGiam(20));
                     System.out.println(s3.xuatGiaBanSauGiam(30));
                     System.out.println("s1 cung nam xuat ban s2? "+s1.cungNamXuatBan(s3));
    }
}
