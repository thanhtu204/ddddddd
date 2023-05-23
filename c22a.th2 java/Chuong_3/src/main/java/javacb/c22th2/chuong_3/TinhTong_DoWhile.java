/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c22th2.chuong_3;

import java.util.Scanner;

/**
 *
 * @author KHOACNTT
 */
public class TinhTong_DoWhile {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
         int n, tong = 0;
         int i=1;
        System.out.printf("Nhap so n: ");
        n = S.nextInt();
        do {      
            
            System.out.printf(" Nhap he so thu %d:", i);
            int x = S.nextInt();
            tong += x;
            i++;
        } while (i<=n);
          System.out.printf("tong so %d", tong);
    }
}
