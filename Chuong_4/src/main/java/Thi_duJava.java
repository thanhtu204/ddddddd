/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class Thi_duJava {
    public static void main(String[] args) {
     Diem A = new Diem();
     Diem B = new Diem();
     A.NhapDiem();
     A.Xuat();
     double kq= A.Tinhtoan(B);
        System.out.printf("Vay co khoan2g cach diem la %.2f",kq);
    }
}
