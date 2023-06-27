/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_buoi03;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
// Mang co 5 phan tu, nhaptu ban phim,
//Xuat tong gia tri cac phan tu
//Xuat tong gia tri cac phan tu chan
//Xuat so cac phan tu le chia het cho 3
//Xuat so nguyen to

public class Mang02 {
    public static void main(String[] args) {
        int [] myArr = new int[5];
        Scanner s = new Scanner(System.in);
        int tong=0;
        int tongChan=0;
        int demLe=0;
        for(int i=0;i<myArr.length;i++){
            System.out.printf("Nhap myArr[%d]: ",i);
            myArr[i] = s.nextInt();
        }
        System.out.println("Mang vua nhap: ");        
        for(int x:myArr){           
            System.out.printf("%5d",x);
            tong+=x;
            if(x%2==0)
                tongChan += x;
            if(x%2!=0&&x%3==0)
                demLe++;          
        }
        System.out.println("\nTong gia tri cua mang: "+tong);
        System.out.println("\nTong gia tri cua phan tu chan trong mang: "+tongChan);
        System.out.println("\nTong cac phan tu le trong mang va chia het cho 3: "+demLe);
        System.out.println("\nSo nguyen to trong mang: ");
        for(int x:myArr){
            if(timSoNguyenTo(x))                        
                System.out.printf("%5d",x);               
        }
    }
    public static boolean timSoNguyenTo(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int canN = (int) Math.sqrt(n);
        for (int i = 2; i <= canN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}