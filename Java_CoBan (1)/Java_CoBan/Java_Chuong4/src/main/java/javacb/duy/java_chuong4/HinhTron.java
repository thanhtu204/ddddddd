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
public class HinhTron {
    double bk;
    Diem tam;
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        this.bk = s.nextDouble();
        tam = new Diem();
        this.tam.nhap("O");
    }
    public void xuat(){
        System.out.printf("Duong tron tam O(%.2f,%.2f), ban kinh: %.2f\n",this.tam.x,this.tam.y,this.bk);
        System.out.println("Chu vi hinh tron: "+this.tinhChuVi());
        System.out.println("Dien tich hinh tron: "+this.tinhDienTich());
    }
    private double tinhChuVi(){
        return 2*3.14*this.bk;
    }
    private double tinhDienTich(){
        return 3.14*this.bk*this.bk;
    }
}
