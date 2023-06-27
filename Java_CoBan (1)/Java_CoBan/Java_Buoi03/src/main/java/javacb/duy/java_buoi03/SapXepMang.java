/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_buoi03;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class SapXepMang {
    public static void main(String[] args) {
        int[] myArr = {3,5,1,2,9,4,6,8};
        int [] myArr2 = myArr;
        System.out.println("\nMang chua sap xep:");
        for(int x : myArr){
            System.out.printf("%5d",x);
        }
        for(int i = 0;i<myArr.length-1;i++){
            for(int j =i+1;j<myArr.length;j++){
                if(myArr[i]>myArr[j]){
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }    
            }
        }
        System.out.println("\nMang da sap xep tang dan:");
        for(int x : myArr){
            System.out.printf("%5d",x);
        }
        for(int i = 0;i<myArr.length-1;i++){
            for(int j =i+1;j<myArr.length;j++){
                if(myArr[i]<myArr[j]){
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }    
            }
        }
        System.out.println("\nMang da sap xep giam dan:");
        for(int x : myArr){
            System.out.printf("%5d",x);
        }
        System.out.println("\nSu dung thu vien Arrays cua java");
        System.out.println("\nMang chua sap xep: "+Arrays.toString(myArr2));
        Arrays.sort(myArr2);
        System.out.println("\nMang sap xep tang dan: "+Arrays.toString(myArr2));
        for(int i =0;i<myArr2.length;i++){
            myArr2[i] *= -1;
        }
        Arrays.sort(myArr2);
        for(int i =0;i<myArr2.length;i++){
            myArr2[i] *= -1;
        }
        System.out.println("\nMang sap xep giam dan: "+Arrays.toString(myArr2));
    }
}
