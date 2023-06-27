/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GhiFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DocFile {
    public static void main(String[] args) {
        String duongDan = "data/baitho1.txt";
        ArrayList<String> mangDong = new ArrayList<>();
        mangDong.add("Tren troi co dam may xanh");
        mangDong.add("Chinh giua may trang");
        mangDong.add("Xung quanh may vang");
        System.out.println(mangDong.toString());
        FileWriter ghiFile;
        try {
            ghiFile = new FileWriter(duongDan);
            BufferedWriter ghi = new BufferedWriter(ghiFile);
            for(String s:mangDong){
                ghi.write(s);
                ghi.newLine();
            }
            ghi.close();
        } catch (IOException ex) {
            System.out.println("Ghi file that bai");
        }
        
        
        
    }
}
