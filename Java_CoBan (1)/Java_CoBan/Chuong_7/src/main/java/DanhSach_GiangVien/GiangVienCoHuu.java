/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_GiangVien;

import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GiangVienCoHuu extends GiangVien{
    private int soGioQuyDinh;
    public GiangVienCoHuu(){}

    public GiangVienCoHuu( String hoTen, Ngay ngaySinh, int soGioDay, int luongThoaThuan, int day, int month, int year,int soGioQuyDinh) {
        super(hoTen, ngaySinh, soGioDay, luongThoaThuan, day, month, year);
        this.soGioQuyDinh = soGioQuyDinh;
    }
    public void Nhap(){
        super.Nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("- Nhap so gio quy dinh: ");
        this.soGioQuyDinh =s.nextInt();
    }
    public double ThuNhap(){
        return (this.soGioQuyDinh* super.luongThoaThuan) + ((super.soGioDay-this.soGioQuyDinh)*150000);
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("- Thu Nhap: "+this.ThuNhap()+"\n");
    }
}
