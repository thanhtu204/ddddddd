/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box_Ex;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class XuLiBox {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(5);
        b1.xuatThongTin();
        Box<Double> b2 = new Box<>(5.2);
        b2.xuatThongTin();
        Box<String> b3 = new Box<>("Hello");
        b3.xuatThongTin();
        
        
        ArrayList myArr = new ArrayList();
        myArr.add(5);
        myArr.add(5.2);
        myArr.add("Hello");
        myArr.add(true);
        String chuoi = myArr.toString();
        System.out.println("Chuoi myArr: "+chuoi);
        
        double a1 =(double)myArr.get(1);
        System.out.println("Phan tu thu 1: "+a1);
        
        System.out.println("Chuoi myArr truoc xoa: "+chuoi);
        myArr.remove(a1);
        System.out.println("Chuoi myArr sau xoa: "+myArr.toString());
        System.out.println("Chuoi myArr truoc gan gia tri: "+myArr.toString());
        myArr.set(1, 9.9);
        System.out.println("Chuoi myArr sau gan gia tri: "+myArr.toString());
        
        
        
        ArrayList<Integer> myArr2 = new ArrayList<>();
        myArr2.add(1);
        myArr2.add(98);
        myArr2.add(3);
        myArr2.add(18);
        System.out.println("Chuoi myArr2 : "+myArr2.toString());
        int a2 = myArr2.get(1);
        System.out.println("Phan tu thu 1: "+a2);
        
        System.out.println("Chuoi myArr truoc xoa: "+chuoi);
        myArr2.remove(1);
        System.out.println("Chuoi myArr sau xoa: "+myArr2.toString());
        System.out.println("Chuoi myArr truoc gan gia tri: "+myArr2.toString());
        myArr2.set(1, 9);
        System.out.println("Chuoi myArr sau gan gia tri: "+myArr2.toString());
    }
}
