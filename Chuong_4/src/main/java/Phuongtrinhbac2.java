
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
public class Phuongtrinhbac2 {

    int a, b, c;

    public void Nhappt() {
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        this.a = S.nextInt();
        System.out.print("Nhap he so b: ");
        this.c = S.nextInt();
        System.out.print("Nhap he so c: ");
        this.b = S.nextInt();
    }
    private double Tinhdentra(){
        double denta= (this.b *this.b)- 4*this.a*this.c;
        return  denta;
    }
}
