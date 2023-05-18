/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author KHOACNTT
 */
public class Ngaynam {
    public static void main(String[] args) {
        int thang,nam;
        Scanner s = new Scanner (System.in);
        System.out.print(" Nhap thang:");
        thang = s.nextInt();
        System.out.println("Nhap nam:");
        nam = s.nextInt();
        if(thang==1 || thang==3 || thang==5|| thang==7|| thang==8 ||thang==10||thang==12 ){
            System.out.println("Thang co 31 ngay:");
        }else if( thang==4 ||thang==6||thang==9||thang==11){
            System.out.println("Thang co 30  ngay:");
        }else if(thang==2){
             if(nam % 4 == 0 && )
        }
}
}
