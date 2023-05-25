
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
public class DuongTron {

    double r;
    Diem I;

    public void NhapDt() {
        I = new Diem();
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap ban kinh r:");
        this.r=S.nextDouble();
        System.out.println("Nhap toa do diem I:");
        this.I.NhapDiem();
        System.out.println("");
    }

    public void Xuatdt() {
        System.out.println("ban kinh r= \n" + this.r);
        System.out.printf("vay toa do I(%.2f,%.2f)\n",this.I.x,this.I.y);

    }
    public  void TinhToan(){
        double cv= (this.r*2)*3.14;
        System.out.printf("chu vi hinh tron la: %.2f\n",cv);
        double dt=(this.r*this.r)*2;
        System.out.print("dien tich hinh tron la: "+dt);
    }
}
