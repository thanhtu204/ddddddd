/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test1;

/**
 *
 * @author Administrator
 */
public class TinhToan {
    public static void main(String[] args) {
        double r = 0;
        for(int i=0;i<10;i++){
            while(r<30||r>50){
                double t = Math.random()*100;
                r = Math.round(t);
            }
            System.out.printf("So thu %d: %.0f",i+1,r);
            System.out.println("");
            r=0;
        }
    }
}
