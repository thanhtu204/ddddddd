/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DocGhiFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class HS_DocFile {
    public static void main(String[] args) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        String duongDan = "data/dsHocSinh.txt";

        try {
            FileReader file = new FileReader(duongDan);
            BufferedReader docFile = new BufferedReader(file);
            String dong;
            while((dong = docFile.readLine()) != null ){
                String[] mangGhi = dong.split(";");
                HocSinh hs = new HocSinh(mangGhi[0],mangGhi[1],Integer.parseInt(mangGhi[2]));
                dshs.add(hs);
            }
            docFile.close();
            for(HocSinh hs: dshs){
                System.out.println(hs);
            }
        } catch (IOException ex) {
            System.out.println("Doc file that bai");
        }
    }
}
