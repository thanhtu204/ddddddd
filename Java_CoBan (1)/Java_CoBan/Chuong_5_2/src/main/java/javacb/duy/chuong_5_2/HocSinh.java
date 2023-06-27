/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5_2;

/**
 *
 * @author Administrator
 */
public class HocSinh {
    private String maHS;
    private String tenHocSinh;
    private LopHoc lop;
    private float diemToan;
    private float diemVan;
    private Ngay ngaySinh;

    public HocSinh(String maHS, String tenHocSinh, LopHoc lop, float diemToan, float diemVan, Ngay ngaySinh) {
        this.maHS = maHS;
        this.tenHocSinh = tenHocSinh;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.ngaySinh = ngaySinh;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String xuatTenKhoa(){
        return this.lop.getKhoa().getTenKhoa();
    }
    public double tinhTrungBinh(){        
        return (double)Math.round(((this.diemToan*2) + this.diemVan)/3*100)/100;
        
    }
    public String tinhXepLoai(){
        double diemTB = this.tinhTrungBinh();
        if(diemTB>9)
            return "Xuat Sac";
        else if(diemTB>=8)
            return "Gioi";
        else if(diemTB>=6.5)
            return "Kha";
        else if(diemTB>=5)
            return "Trung Binh";
        return "Yeu";
    }
    public boolean kiemTraNgaySinhGiongNhau(HocSinh h2){
        return this.ngaySinh.equals(h2.ngaySinh);
    }
}
