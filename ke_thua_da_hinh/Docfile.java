/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ke_thua_da_hinh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author KHOACNTT
 */
public class Docfile {
    public static void main(String[] args) {
        ArrayList <HocSinh> ds  = new ArrayList<>();
        try {
            FileReader file = new FileReader("conđa/du.txt");
            BufferedReader docfile= new BufferedReader(file);
            String dong ;
            while ((dong=docfile.readLine())!=null) {
             String [] mangTach= dong.split("-");
             
             HocSinh hs = new HocSinh();
             
             ds.add
            }
        } catch (IOException ex) {
            System.out.print("Error!!!");
            
        }
    }
}
