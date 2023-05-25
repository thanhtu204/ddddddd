
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
public class Diem {
    double x,y;
    
    public   void NhapDiem(){
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap trung do: ");
       this.x=S.nextDouble();
         System.out.print("Nhap hoanh do: ");
       this.y=S.nextDouble();
       
    }
    public  void Xuat(){
        System.out.printf("Vay A co diem (%.2f,%.2f)\n",this.x,this.y);
    }
    public  double Tinhtoan(Diem B){
        double kq;
        double dx,dy;
        dx = this.x -B.x;
        dy=this.y-B.y;
        kq=Math.sqrt((dx*dx)+(dy*dy));
        System.out.printf("Vay khoang cach AB co do dai la: %.2f ",kq);
        return  kq;
    }
}
