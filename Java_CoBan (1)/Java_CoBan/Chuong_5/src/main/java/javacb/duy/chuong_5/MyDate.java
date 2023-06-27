/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyDate {
    private int day=1;
    private int month=1;
    private int year=2000;
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int d = s.nextInt();
        if(d>1&&d<=31){
            this.day = d;
        }
        System.out.print("Nhap thang: ");
        int m = s.nextInt();
        if(m>1&&m<=12){
            this.month = m;
        }
        System.out.print("Nhap nam: ");
        int y = s.nextInt();
        if(y>2000){
            this.year = y;
        }
    }
    public void xuatNgayThangNam(){
        System.out.printf("Ngay thang nam: %d - %d - %d",this.day,this.month,this.year);
    }
}
