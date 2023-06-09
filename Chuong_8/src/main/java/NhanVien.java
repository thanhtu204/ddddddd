
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class NhanVien extends NguoiLaoDong{

    private String chucVu;
    private String loaiNV;

    public NhanVien() {
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("-Xep loai : ");
    }

    @Override
    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap chuc vu: ");
        this.chucVu=s.nextLine();
        System.out.print("Nhap loai nhan vien co 3 loai nhan vien A,B,C: ");
        do{
             this.loaiNV=s.nextLine();
         if(!this.loaiNV.equalsIgnoreCase("B") ||this.loaiNV.equalsIgnoreCase("A")||!this.loaiNV.equalsIgnoreCase("C")) {
            } else {
            }
                    System.out.println("Khong co loai nhan vien do vui long chon lai: ");
          }while (!this.loaiNV.equalsIgnoreCase("B") ||this.loaiNV.equalsIgnoreCase("A")||!this.loaiNV.equalsIgnoreCase("C"));        
       
        
    }

    
    @Override
    public double ThuNhap() {
         double luongcb = this.tienLuongCB();
    double phanTram = 0;
                 
           if(this.loaiNV.equalsIgnoreCase("A")){
        phanTram=100;
      }
                else if(this.loaiNV.equalsIgnoreCase("B")){    
                    phanTram=80;
                }
                else if (this.loaiNV.equalsIgnoreCase("C"))
                    phanTram=50;
                        
                              
                  return luongcb+luongcb*phanTram/100;
    }
    
    
 
    
}
