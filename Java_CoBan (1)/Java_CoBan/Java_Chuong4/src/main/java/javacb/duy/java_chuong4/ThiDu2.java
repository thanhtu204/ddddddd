/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_chuong4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ThiDu2 {
    public static void main(String[] args) {
        double xA,xB,yA,yB,d;
        xA = nhap("Nhap hoanh do A: ");
        yA = nhap("Nhap tung do A: ");
        xB = nhap("Nhap hoanh do B: ");
        yB = nhap("Nhap tung do B: ");
        xuat(xA,yA,"A");
        xuat(xB,yB,"B");
        d = tinhKC(xA, xB, yA, yB);
        System.out.println("Khoang cach A-B: "+d);
    }
    public static double nhap(String thongBao){
        Scanner s = new Scanner(System.in);
        double kq;
            System.out.print(thongBao);
            kq = s.nextDouble();
        return kq;
    }
    public static void xuat(double x, double y, String diem){
        System.out.printf("Diem %s(%.2f,%.2f)\n",diem,x,y);
    }   
    public static double tinhKC(double xA,double xB,double yA,double yB){
        double kq;
        double dX = xA-xB;
        double dY = yA-yB;
        kq = Math.sqrt(dX*dX + dY*dY);
        return kq;
    }
}
