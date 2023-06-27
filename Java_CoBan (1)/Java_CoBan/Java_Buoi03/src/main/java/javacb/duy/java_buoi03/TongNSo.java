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
public class TongNSo {
    public static void main(String[] args) {
        int n,tong=0,i=1;
        Scanner s = new Scanner(System.in);
        System.out.println("For-------------------------");
        System.out.print("Nhap n: ");
        n = s.nextInt();
        for(int j =1;j<=n;j++){
            System.out.printf("Nhap so thu %d: ",j);
            int x = s.nextInt();
            tong+=x;
        }
        System.out.printf("Tong cua %d so la: %d\n",n,tong);
        tong=0;
        System.out.println("Do--While------------------");
        System.out.print("Nhap n: ");
        n = s.nextInt();
        do{
            System.out.printf("Nhap so thu %d: ",i);
            int x = s.nextInt();
            tong+=x;
           i++;
        }while(i<=n);
        System.out.printf("Tong cua %d so la: %d\n",n,tong);
        System.out.println("While-----------------------");
        tong=0;
        i=1;
        System.out.print("Nhap n: ");
        n = s.nextInt();
        while(i<=n){
            System.out.printf("Nhap so thu %d: ",i);
            int x = s.nextInt();
            tong+=x;
            i++;
        }
        System.out.printf("Tong cua %d so la: %d\n",n,tong);
    }
}
