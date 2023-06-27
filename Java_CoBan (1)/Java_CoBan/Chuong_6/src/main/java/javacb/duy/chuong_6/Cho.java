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
public class Cho extends DongVat{
    private int soChan;

    public Cho(String ten, String mau,int soChan) {
        super(ten,mau);
        this.soChan = soChan;
    }
    public void sua(){
        System.out.println("Gau Gau!");
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println(" - So chan: "+this.soChan);
    }
}
