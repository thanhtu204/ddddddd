/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_chuong4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HocSinh {
    String hoTen;
    float diemVan, diemToan;
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap thong tin hs: ");
        System.out.print("Nhap ten hs: ");
        this.hoTen = s.nextLine();
        System.out.print("Diem van: ");
        this.diemVan = s.nextFloat();
        System.out.print("Diem toan: ");
        this.diemToan = s.nextFloat();
    }
    private double tinhTB(){
        return (this.diemVan+this.diemToan)/2;
    }
    private String xepLoai(){
        String xl = "";
        double kq = this.tinhTB();
        if(kq>=9){
            xl = "Xuat Sac";
        }else if(kq>=8){
            xl = "Gioi";
        }else if(kq>=7){
            xl = "Kha";
        }else if(kq>=5){
            xl = "Trung Binh";
        }else{
            xl = "Yeu";
        }        
        return xl;
    }
    public void xuat(){
        System.out.printf("Hoc sinh: %s - Diem tb: %.2f, Xep loai: %s\n",this.hoTen,this.tinhTB(),this.xepLoai());
    }
}
