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
public class SoNguyenTo {
    public static void main(String[] args) {
        //Số nguyên tố là số lớn hơn 1 thỏa đk: chỉ chi hết cho 1 và chính nó
        //Dùng vòng lặp while để xác định số đó có phải số nguyên tố k ?
        // Kiểm tra từ 2 đến n/2
        int n,i=2;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = s.nextInt();
        boolean flat = true;
        while(i<=n/2){
            if(n%i==0){
                System.out.printf("%d khong la so nguyen to\n",n);
                flat=false;
                break;
            }  
            i++;           
        }
        if(flat)
            System.out.printf("%d la so nguyen to\n",n);
    }
}
