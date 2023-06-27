/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_6;

/**
 *
 * @author Administrator
 */
public class DongVat {
    protected String ten;
    protected String mau;

    public DongVat(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
    public void an(){
        System.out.println("Cho an!");
    }
    public void inThongTin(){
        System.out.print("Cho ten: "+this.ten+" - Mau: "+this.mau);
    }
}
