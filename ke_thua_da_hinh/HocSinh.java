package javacb.c21th1.ke_thua_da_hinh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class HocSinh {
    private String mahs;
    private String tenHocSinh;
      private double  diemVan;

    HocSinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public String getMahs() {
        return mahs;
    }

    public void setMahs(String mahs) {
        this.mahs = mahs;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public HocSinh(String mahs, String tenHocSinh, double diemVan) {
        this.mahs = mahs;
        this.tenHocSinh = tenHocSinh;
        this.diemVan = diemVan;
    }

      

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

   
   
}
