/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocSinh_DocGhiFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class HS_GhiFile {
    public static void main(String[] args) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        dshs.add(new HocSinh("B01","Nguyen Van A",21));
        dshs.add(new HocSinh("B02","Bui Van B",22));
        dshs.add(new HocSinh("B03","Tran Thi C",23));
        dshs.add(new HocSinh("B04","Le Thi D",24));
        dshs.add(new HocSinh("B05","Vuong Van E",25));
        String duongDan = "data/dsHocSinh2.txt";
        
        try {
            FileWriter file = new FileWriter(duongDan);
            BufferedWriter ghiFile = new BufferedWriter(file);
            for(HocSinh hs : dshs){
                String dong = hs.getMaHS() +";"+ hs.getTenHS() +";"+ hs.getTuoi();
                ghiFile.write(dong);
                ghiFile.newLine();
            }
            ghiFile.close();
        } catch (IOException ex) {
            System.out.println("Ghi file khong thanh cong");
        }
        
    }
}
