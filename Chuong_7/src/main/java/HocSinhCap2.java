/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class HocSinhCap2 extends HocSinhTT {

    private double diemToan;
    private double diemVan;

    public HocSinhCap2(double diemToan, double diemVan, String maHS, String tenHS) {
        super(maHS, tenHS);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
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

    @Override
    public void inThongtin() {
        super.inThongtin();
        System.out.print("-"+"diem toan"+diemToan+"-"+"diem van"+diemVan+"--"+"Diem trung binh: "+tinhDiemTB()+"--");
        xepLoai();
    }

    @Override
    protected void xepLoai() {
               if (this.tinhDiemTB() >= 9) {
            System.out.print("Hoc sinh xuat sac");
        } else if (this.tinhDiemTB() >= 8) {
            System.out.print("Hoc sinh gioi");
        } else if (this.tinhDiemTB() >= 7) {
            System.out.print("Hoc sinh kha");
        } else if (this.tinhDiemTB() >= 5) {
            System.out.print("Hoc sinh tb");
        } else if (this.tinhDiemTB() < 5) {
            System.out.print("Hoc sinh yeu");
        }
    }

    /**
     *
     * @return
     */
    @Override
    protected double tinhDiemTB() {
        return (diemToan+diemVan)/2;
    }

   

}
