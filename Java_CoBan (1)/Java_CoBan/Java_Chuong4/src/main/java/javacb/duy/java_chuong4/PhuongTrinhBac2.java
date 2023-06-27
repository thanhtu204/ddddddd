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
public class PhuongTrinhBac2 {
    int a,b,c;
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        System.out.print("Nhap he so c: ");
        c = s.nextInt();
    }
    private String giaiPT2(){
        String kq = "";
        if(this.a == 0){
            PhuongTrinhBac1 pt1 = new PhuongTrinhBac1();
            pt1.a = this.b;
            pt1.b = this.c;
            pt1.xuat();
        }else{
            int delta = this.tinhDelta();           
            if(delta<0){
                kq= "Phuong trinh vo nghiem";
            }
            if(delta==0){
                double x1 = -(double)this.b/(2*this.a);
                kq = "Phuong trinh co nghiem kep: "+x1;
            }
            if(delta>0){
                double x1 = (-this.b+Math.sqrt(delta))/(2*this.a);
                double x2 = (-this.b-Math.sqrt(delta))/(2*this.a);
                kq = "Phuong trinh co nghiem x1 = "+x1+", x2 = "+x2;
            }
        }
        return kq;
    }
    private int tinhDelta(){    
        return ((this.b*this.b) - (4*this.a*this.c));
    }
    public void xuat(){
        System.out.println(giaiPT2());
    }
    
}
