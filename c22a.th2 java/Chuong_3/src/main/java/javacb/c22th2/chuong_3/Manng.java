/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c22th2.chuong_3;
import java.util.Arrays;
/**
 *
 * @author KHOACNTT
 */
public class Manng {
    public static void main(String[] args) {
        
        int[] myNumbers = {2, 1, 6, -5,3,10,-2,11};
//        for(int x:myNumbers){
//            x*=-1;
//            System.out.printf("%5d",x);  
//        }
          System.out.println("");
          for(int i=0;i<myNumbers.length;i++){
              myNumbers[i] = myNumbers[i]*-1;
          }
        Arrays.sort(myNumbers);
        System.out.print("Mang sau khi xep sap : "+Arrays.toString(myNumbers));
        System.out.println("");
            for(int x:myNumbers){
            x*=-1;
            System.out.printf("%5d",x);  
        }
    }
}
