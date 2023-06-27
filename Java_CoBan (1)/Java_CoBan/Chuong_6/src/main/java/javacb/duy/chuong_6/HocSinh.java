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
public class HocSinh {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinh(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
    public void inThongTin(){
        System.out.print("Ma hs: "+this.maHS+" - Ten: "+this.tenHS+" - Phai: "+this.phai);
    }
    public double tinhTrungBinh(){
        return 0;
    }
    public String tinhXepLoai(){
        return "";
    }
}
