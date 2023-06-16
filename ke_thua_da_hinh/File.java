/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ke_thua_da_hinh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHOACNTT
 */
public class File {
    public static void main(String[] args) {
          ArrayList<String> mang = new ArrayList<>();
          mang.add("Hom qua tat nuoc dau tinh");
           mang.add("Bo quen chiec ao tren canh hoa sen");
        try {
            FileWriter ghifile = new FileWriter("conđa/nguyencu.txt");
            BufferedWriter ghi = new BufferedWriter(ghifile);
            for (String dong : mang) {
                ghi.write(dong);
                ghi.newLine();
                
            }
            ghi.close();
        } catch (IOException ex) {
            System.out.print("Ghi tap tin that bai: ");
            ex.printStackTrace();
          }
    }
  
   
}
