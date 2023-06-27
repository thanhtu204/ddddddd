/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GhiFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class GhiFile {
    public static void main(String[] args) {
        String duongDan = "data/baitho.txt";
        ArrayList<String> mangDong = new ArrayList<>();
        
        try {
            FileReader docFile = new FileReader(duongDan);
            BufferedReader doc = new BufferedReader(docFile);
            String dong;
            while((dong = doc.readLine())!=null){
                mangDong.add(dong);
            }
            for(String d:mangDong){
                System.out.println(d);
            }
            doc.close();
        } catch (IOException ex) {
            System.out.println("Doc file that bai!");
            ex.printStackTrace();
        }
    }
}
