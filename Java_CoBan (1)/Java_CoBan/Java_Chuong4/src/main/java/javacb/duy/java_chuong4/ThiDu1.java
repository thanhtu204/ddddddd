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
public class ThiDu1 {
    public static void main(String[] args) {
        double xA,xB,yA,yB,d;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap hoanh do A: ");
        xA = s.nextDouble();
        System.out.print("Nhap tung do A: ");
        yA = s.nextDouble();
        System.out.print("Nhap hoanh do B: ");
        xB = s.nextDouble();
        System.out.print("Nhap tung do B: ");
        yB = s.nextDouble();
        
        System.out.printf("Diem A(%.2f,%.2f)\n",xA,yA);
        System.out.printf("Diem B(%.2f,%.2f)\n",xB,yB);
        
        double dX = xA-xB;
        double dY = yA-yB;
        
        d = Math.sqrt(dX*dX + dY*dY);
        
        System.out.println("Khoang cach A-B : "+d);
    }
}
