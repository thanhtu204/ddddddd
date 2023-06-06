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
    private LopHoc lh;
    private double  diemToan;
    private double  diemVan;
    private Ngay n;

    public HocSinh(String mahs, String tenHocSinh, LopHoc lh, double diemToan, double diemVan, Ngay n) {
        this.mahs = mahs;
        this.tenHocSinh = tenHocSinh;
        this.lh = lh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.n = n;
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

    public LopHoc getLh() {
        return lh;
    }

    public void setLh(LopHoc lh) {
        this.lh = lh;
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

    public Ngay getN() {
        return n;
    }

    public void setN(Ngay n) {
        this.n = n;
    }
    public void xuatTenKhoa(){
        System.out.println(this.lh.getKhoa().getTenKhoa());  
    }
    public double  tinhDiemtb(){
        double diemtb;
        return  diemtb =((diemToan*2)+diemVan)/3;
    }
    public void tinhXepLoai(){
        double diemtb;
        diemtb =((diemToan*2)+diemVan)/3;
        if(diemtb>=9)
            System.out.println("Xuat sac");
        else if(diemtb>=8)
            System.out.println("Gioi");
        else if(diemtb>=6.5)
                System.out.println("Kha");
        else if(diemtb>=5)
            System.out.println("trung binh");
        else if(diemtb<5)
            System.out.println("Yeu");
    }
    public boolean  kiemTraNgaySinh(HocSinh h2){
        return this.n.equals(h2.n);
    }
}
