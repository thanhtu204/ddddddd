/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_buoi02;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhepToan {
    public static void main(String[] args) {
        //1. Phát sinh số ngẫu nhiên
        int min = 30;
        int max = 50;
        for (int i =0;i<10;i++){
            int n = (int)(Math.random()*(max-min)+min);
            System.out.printf("So thu %d: %d",i+1,n);
            System.out.println("");
        }
        //2. Chuyển một chuỗi về kiểu nguyên thủy
        String str1 = "13";
        int n1 = Integer.parseInt(str1);
        System.out.println("So nguyen sau khi chuyen: "+n1);
        
        String str2 = "13.5";
        float n2 = Float.parseFloat(str2);
        System.out.println("So thuc sau khi chuyen: "+n2);
        //3.Bắt lỗi với Try... Catch
        Scanner s = new Scanner(System.in);
//        try {
//            System.out.print("Nhap vao so nguyen: ");
//            int a = s.nextInt();
//            System.out.println("So nguyen vua nhap: "+a);
//        } catch (Exception e) {
//            System.out.println("Nhap sai kieu du lieu!");
//        }
        //4. Bắt lỗi với hasnextInt;
        System.out.print("Nhap vao so nguyen: ");
        if(s.hasNextInt()){
            int a = s.nextInt();
            System.out.println("So nguyen vua nhap: "+a);
        }else{
            System.out.println("Nhap sai du lieu!");
        }
    }
}
