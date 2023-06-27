/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_buoi03;

/**
 *
 * @author Administrator
 */
public class TrungBinhCong {
    public static void main(String[] args) {
        int batDau = 27;
        int ketThuc = 250;
        int demSo = 0;
        int tong = 0;
        System.out.println("While-------------------------------");
        while(batDau <= ketThuc){
            if(batDau % 3 == 0 ){
                tong += batDau;
                demSo++;               
            }
            batDau++;
        }
        System.out.println("Trung binh cong: "+(float)tong/demSo);
        System.out.println("Do----While-------------------------");
        do{
            if(batDau % 3 == 0 ){
                tong += batDau;
                demSo++;               
            }
            batDau++;
        }while(batDau <= ketThuc);
        System.out.println("Trung binh cong: "+(float)tong/demSo);
        System.out.println("For---------------------------------");
        for(int i = batDau;i<=ketThuc;i++){
            if(i % 3 == 0 ){
                tong += i;
                demSo++;               
            }           
        }
        System.out.println("Trung binh cong: "+(float)tong/demSo);        
    }
}
