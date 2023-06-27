/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box_Ex;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class test {
    public static void main(String[] args) {
        String a = "A01|Duong Thanh Duy|Nam|200000";
        String[] mangA = a.split("|");
        System.out.println("mang A: "+Arrays.toString(mangA));
    }
}
