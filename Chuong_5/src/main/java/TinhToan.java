
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class TinhToan {
    public static void main(String[] args) {
        double monVan,  monToan,  monAnh;
        Nhapdiem hs = new Nhapdiem();
         Scanner S = new Scanner(System.in);
        System.out.println("Nhap mon van :");
        monVan = S.nextDouble();
        System.out.println("Nhap mon Toan :");
        monToan = S.nextDouble();
        System.out.println("Nhap mon Anh :");
        monAnh = S.nextDouble();
        hs.nhapdiemmon(monVan, monToan, monAnh);
        hs.xuatdiem();
        hs.diemtb();
    }
}
