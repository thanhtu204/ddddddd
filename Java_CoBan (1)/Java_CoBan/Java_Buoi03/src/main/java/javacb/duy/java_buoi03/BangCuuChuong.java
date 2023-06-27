/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.java_buoi03;

/**
 *
 * @author Administrator
 */
public class BangCuuChuong {
    public static void main(String[] args) {
        int i = 1;
        final int so = 7;
        System.out.println("While-------------------------");
        while(i<11){
            System.out.printf("%2d x %2d = %2d\n",so,i,i*so);           
            i++;
        }
        i=1;
        System.out.println("For---------------------------");
        for(int j =1;j<11;j++){
            System.out.printf("%2d x %2d = %2d\n",so,j,j*so);           
        }       
        System.out.println("Do------While-----------------");
        do{
            System.out.printf("%2d x %2d = %2d\n",so,i,i*so);           
            i++;
        }while(i<11);
    }
}
