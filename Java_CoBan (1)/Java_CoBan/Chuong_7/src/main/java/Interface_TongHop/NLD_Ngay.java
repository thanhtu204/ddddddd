/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NguoiLaoDong.*;
import javacb.duy.chuong_7.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NLD_Ngay {
    private int day;
    private int month;
    private int year;

    public NLD_Ngay(){}
    public NLD_Ngay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NLD_Ngay other = (NLD_Ngay) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;
    }
    
    public Ngay NhapNgay(){
        Ngay ngayA= new Ngay();
        Scanner s = new Scanner(System.in);
        System.out.print("\t +Nhap ngay: ");
        int a = s.nextInt();
        ngayA.setDay(a);
        System.out.print("\t +Nhap thang: ");
        int b = s.nextInt();
        ngayA.setMonth(b);
        System.out.print("\t +Nhap nam: ");
        int c = s.nextInt();
        ngayA.setYear(c);
        return ngayA;
    }
    protected void Xuat(Ngay ngayA){
        System.out.println(+ngayA.getDay()+"-"+ngayA.getMonth()+"-"+ngayA.getYear());
    }
}
