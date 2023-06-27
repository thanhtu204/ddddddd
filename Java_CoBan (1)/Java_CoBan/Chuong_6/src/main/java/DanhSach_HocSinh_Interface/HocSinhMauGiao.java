/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

/**
 *
 * @author Administrator
 */
public class HocSinhMauGiao extends HocSinh{
    private int soNgayNghi;

    public HocSinhMauGiao(String maHS, String tenHS, String phai,int tuoi,int soNgayNghi) {
        super(maHS, tenHS, phai,tuoi);
        this.soNgayNghi = soNgayNghi;
    }

    @Override
    public void inHocSinh() {
        super.inHocSinh(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(", xep loai: "+this.tinhXepLoai());
    }
    @Override
    public String tinhXepLoai(){
        return this.soNgayNghi > 5 ? "Suy dinh duong":"Be khoe";
    }
    
}
