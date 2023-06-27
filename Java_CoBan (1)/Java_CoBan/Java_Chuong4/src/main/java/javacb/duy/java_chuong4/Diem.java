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
public class Diem {
    double x,y;
    
    public void nhap(String thongBao){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap diem %s:\n",thongBao);
        System.out.printf("Nhap hoanh do %s: ",thongBao);
        this.x = s.nextDouble();
        System.out.printf("Nhap tung do %s: ",thongBao);
        this.y = s.nextDouble();
    }
    public void xuat(String thongBao){
        System.out.printf("Diem %s(%.2f,%.2f)\n",thongBao,this.x,this.y);
    }
    public double tinhKC(Diem B){
        double kq;
        double dX = this.x - B.x;
        double dY = this.y - B.y;
        kq = Math.sqrt(dX*dX + dY*dY);
        return kq;
    }
}
