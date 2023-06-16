/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ke_thua_da_hinh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KHOACNTT
 */
public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double  tienThuong;
    int ngaySinh;
private ArrayList <NhanVien> nv;

    public ArrayList<NhanVien> getNv() {
        return nv;
    }

    public void setNv(ArrayList<NhanVien> nv) {
        this.nv = nv;
    }
    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double tienThuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tienThuong = tienThuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        while (true) {            
             System.out.print("Nhap ma nhan vien: ");
             this.maNV = s.nextLine();
             if(!this.maNV.trim().isEmpty())
                 break;
             else 
                 System.out.print("Ban chua nhap ma nhan vien vui long nhap lai!");
             System.out.println("");
             
        }
           while (true) {            
               System.out.print("Nhap ho ten");
             this.hoTen = s.nextLine();
             if(!this.hoTen.trim().isEmpty())
                 break;
             else 
                 System.out.print("Ban chua nhap hoten vui long nhap lai!");
             System.out.println("");
          
             
        }
           System.out.print("Nhap tien thuong: ");
           this.tienThuong = s.nextDouble();
           while (true) {            
              System.out.print("Nhap ngay sinh :");
               try {
                     this.ngaySinh = Integer.parseInt(s.nextLine().trim());
              if(this.ngaySinh>31||this.ngaySinh<1)
                   System.out.print("Ban nhap sai ngay vi ngay khong lon hon 31 va nho hon 1");
              else
                  break;
               } catch (Exception e) {
                   System.out.print("Ban chua nhap ngay sinh: ");
               }
            
        }
         
           
      
     
        
    }
public  void inThongTin(){
   
    System.out.print("ho ten: "+this.hoTen+"-ngay sinh: "+this.ngaySinh);
    
}
public abstract double  thuNhap();
    
      
    

}
