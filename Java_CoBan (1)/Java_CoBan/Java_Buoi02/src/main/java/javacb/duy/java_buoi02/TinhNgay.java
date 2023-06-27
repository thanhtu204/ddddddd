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
public class TinhNgay {
    public static void main(String[] args) {
        int thang,nam;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = s.nextInt();
        System.out.print("Nhap nam: ");
        nam = s.nextInt();
//        if(thang == 1||thang == 3||thang == 5||thang == 7||thang == 8||thang == 10||thang == 12){
//            System.out.println("Thang nhap co 31 ngay");
//        }
//        else if(thang == 4||thang == 6||thang == 9||thang == 11){
//            System.out.println("Thang nhap co 30 ngay");
//        }
//        else if(thang == 2){
//            if((nam % 4 == 0 && nam % 100 !=0)||nam % 400==0){
//                System.out.println("Thang nhap co 29 ngay");
//            }else{
//                System.out.println("Thang nhap co 28 ngay");
//            }
//        }else{
//            System.out.println("Nhap sai du lieu");
//        }
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
}
