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
public class Ngay {
    private int day;
    private int month;
    private int year;

    public Ngay(){}
    public Ngay(int day, int month, int year) {
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
        final Ngay other = (Ngay) obj;
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
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("-Nhap ngay sinh: ");
        System.out.print("\t +Nhap ngay: ");
        this.day = s.nextInt();
        System.out.print("\t +Nhap thang: ");
        this.month = s.nextInt();
        System.out.print("\t +Nhap nam: ");
        this.year = s.nextInt();
    }
    protected void Xuat(){
        System.out.print("-Ngay sinh: "+this.day+"-"+this.month+"-"+this.year);
    }
}
