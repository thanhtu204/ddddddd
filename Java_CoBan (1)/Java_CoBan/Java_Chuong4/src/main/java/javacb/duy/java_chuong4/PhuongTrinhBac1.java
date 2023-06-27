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
public class PhuongTrinhBac1 {
    int a,b;
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
    }
    private String giaiPT(){
        String kq = "";
        if(this.a==0){
            if(this.b==0){
                kq = "PT vo so nghiem";
            }
            else{
                kq = "PT vo nghiem";
            }
        }else{
            double x = -(double)this.b/this.a;
            kq = "PT co nghiem x = " + x;
        }
        return kq;
    }
    public void xuat(){
        System.out.printf("Phuong trinh: %dX + %d = 0\n",this.a,this.b);
        System.out.println(this.giaiPT());
    }
}
