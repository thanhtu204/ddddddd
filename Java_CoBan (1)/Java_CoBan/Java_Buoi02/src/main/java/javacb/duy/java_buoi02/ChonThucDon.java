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
public class ChonThucDon {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int luaChon=-1;  
        do{
            clearScreen();
            System.out.println("************************************");
            System.out.println("    MENU CHUC NANG CHUONG TRINH     ");
            System.out.println("    1. Giai phuong trinh bac 1.     ");
            System.out.println("    2. Giai phuong trinh bac 2.     ");
            System.out.println("    3. Tinh so ngay trong thang     ");
            System.out.println("    4. Ket thuc chuong trinh.       ");
            System.out.println("************************************");
            System.out.print("    Lua chon chuc nang: ");
            luaChon = s.nextInt();
            switch(luaChon){
                case 1:
                    System.out.println("Giai phuong trinh bac 1:");
                    GiaiPTB1();
                    break;
                case 2:
                    System.out.println("Giai phuong trinh bac 2:");
                    GiaiPTB2();
                    break;
                case 3:
                    System.out.println("Tinh so ngay trong thang:");
                    TinhSoNgay();
                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc");
                    break;
                default:
                    System.out.println("Chuc nang chua ton tai!");
            }
        }while(luaChon!=4);     
    }
    public static void GiaiPTB1(){
        int a,b;     
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        GiaiPT(a,b);
    }
    public static void GiaiPTB2(){
        int a,b,c,delta;
        double x1,x2;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        System.out.print("Nhap he so c: ");
        c = s.nextInt();
        if(a==0){ 
            GiaiPT(b,c);
        }else{
            delta = b*b-4*a*c;
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta==0){
                x1 = -(double)b/(2*a);
                System.out.println("Phuong trinh co nghiem kep "+x1);
            }
            if(delta>0){
                x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.printf("Phuong trinh co nghiem x1 = %.2f, x2 = %.2f",x1,x2);
            }
        }
        System.out.println("");
    }
    public static void GiaiPT(int a,int b){
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            float x = -(float)b/a;
            System.out.printf("Phuong trinh co nghiem: "+x);
        }
        System.out.println("");
    }
    public static void TinhSoNgay(){
        int thang,nam;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = s.nextInt();
        System.out.print("Nhap nam: ");
        nam = s.nextInt();
        switch(thang){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("Thang nhap co 31 ngay");
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("Thang nhap co 30 ngay");
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 !=0)||nam % 400==0){
                System.out.println("Thang nhap co 29 ngay");
                }else{
                    System.out.println("Thang nhap co 28 ngay");
                }
                break;
            default:
                System.out.println("Nhap sai du lieu");
        } 
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }  
}
