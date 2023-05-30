
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KHOACNTT
 */
public class Nhapdiem {

    private double monVan, monToan, monAnh;

    public void nhapdiemmon(double monVan, double monToan, double monAnh) {
       
      this.monVan=monVan;
        this.monToan = monToan;
        
        this.monAnh = monAnh;
    }
    public  void xuatdiem(){
        System.out.printf("-Diem mon Van = %.2f\n -Diem mon Toan = %.2f\n -Diem mon Anh = %.2f\n",this.monVan,this.monToan,this.monAnh);
    }
    public  void diemtb(){
        double dtb= (this.monVan+this.monToan+this.monAnh)/3;
    }
    
}
