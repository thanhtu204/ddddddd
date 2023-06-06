
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
public class XuLyConCho {
    public static void main(String[] args) {
        ConCho c=new ConCho();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten con cho: ");
        c.ten=s.nextLine();
        System.out.print("Nhap mau cho: ");
        c.mau=s.nextLine();
        System.out.print("Nhap so chan :");
        c.setSoChan(s.nextLine());
        System.out.print("Nhap so tieng sua con cho: ");
        c.setSua(s.nextLine());
           c.xuatThongtin();
    }
}
