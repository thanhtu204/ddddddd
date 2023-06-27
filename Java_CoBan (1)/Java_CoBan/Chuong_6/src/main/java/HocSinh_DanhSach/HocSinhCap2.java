/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DanhSach;

/**
 *
 * @author Administrator
 */
public class HocSinhCap2 extends HocSinh{
    private double diemToan;
    private double diemVan;
    private double diemLy;
    private double diemHoa;

    public HocSinhCap2(String maHS, String tenHS, String phai,double diemToan, double diemVan, double diemLy, double diemHoa) {
        super(maHS, tenHS, phai);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
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

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
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

    @Override
    public double tinhTrungBinh(){
        return (double)(this.diemToan+this.diemVan+this.diemLy+this.diemHoa)/4;
    }

    @Override
    public void inHocSinh() {
        super.inHocSinh();
        System.out.println(", Diem tb: "+this.tinhTrungBinh()+", xep loai: "+this.tinhXepLoai());
    }

}
