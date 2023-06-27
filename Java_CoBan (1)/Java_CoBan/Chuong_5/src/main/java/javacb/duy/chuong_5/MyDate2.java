/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyDate2 {
    private int day=1;
    private int month=1;
    private int year=2000;
    public MyDate2(int day,int month,int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        if(day>1 && day<=31)
            this.day = day;
    }
    public void setMonth(int month){
        if(month > 1 && month <=12)
            this.month = month;
    }
    public void setYear(int year){
        if(year > 2000)
            this.year = year;
    }
    public void xuatNgayThangNam(){
        System.out.printf("Ngay thang nam: %d - %d - %d\n",this.day,this.month,this.year);
    }
}
