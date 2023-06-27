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
public class NhapDiem {
    public static void main(String[] args) {
        double diem = -1;
        Scanner s = new Scanner(System.in);
        int dem = 0;
        System.out.println("Do-----While------------------------");
        do{
            System.out.print("Nhap diem: ");
            diem = s.nextDouble();
            if(diem<0||diem>10){
                dem++;
                if(dem!=3)
                    System.out.println("Diem khong hop le, nhap lai!");               
            }
            if(dem==3){
                System.out.println("Ban nhap sai qua nhieu,ket thuc!");
                break;
            }
        }while(diem<0||diem>10);
        if(dem!=3)
            System.out.println("Diem vua nhap: "+diem);
        dem=0;
        System.out.println("While-------------------------------");
        while(true){
            System.out.print("Nhap diem: ");
            diem = s.nextDouble();
            if(diem>=0&&diem<=10){
                break;
            }
            dem++;
            if(dem!=3)
                System.out.println("Diem khong hop le, nhap lai!");
            if(dem==3){
                System.out.println("Ban nhap sai qua nhieu,ket thuc!");
                break;
            }
        }
        if(dem!=3)
            System.out.println("Diem vua nhap: "+diem);
        dem=0;
        System.out.println("For---------------------------------");
        for(int i=0;i<1;i++){
            System.out.print("Nhap diem: ");
            diem = s.nextDouble();
            if(diem>=0&&diem<=10){
                break;
            }
            dem++;
            if(dem!=3)
                System.out.println("Diem khong hop le, nhap lai!");
            if(dem==3){
                System.out.println("Ban nhap sai qua nhieu,ket thuc!");
                break;
            }
            i--;
        }
        if(dem!=3)
            System.out.println("Diem vua nhap: "+diem);
    }
}
