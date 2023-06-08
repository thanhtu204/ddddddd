/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public abstract class HocSinhTT {
    protected String maHS;
   protected String tenHS;

    public HocSinhTT(String maHS, String tenHS) {
        this.maHS = maHS;
        this.tenHS = tenHS;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }
   public void inThongtin(){
       System.out.print("Ma hoc sinh : "+tenHS+" Ten hoc sinh: "+tenHS );
        }
   protected abstract void xepLoai();
  protected abstract double  tinhDiemTB();
   
}
