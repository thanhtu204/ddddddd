/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_chuong4;

/**
 *
 * @author Administrator
 */
public class ThiDu3 {
    public static void main(String[] args) {
        Diem A = new Diem();
        A.nhap("A");
        Diem B = new Diem();
        B.nhap("B");
        A.xuat("A");
        B.xuat("B");
        double d = A.tinhKC(B);
        System.out.println("Khoang cach A-B: "+d);
    }
}
