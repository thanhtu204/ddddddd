/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ghidoituongxml;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;



/**
 *
 * @author KHOACNTT
 */
public class Docdoituong {

   
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("data/hocsinh.xml"));
            Element dshocsinh = document.getDocumentElement();
            NodeList dshs = dshocsinh.getElementsByTagName("hocsinh");
            for (int i = 0; i < dshs.getLength(); i++) {
                Element hocsinh = (Element) dshs.item(i);
                  String mahs= hocsinh.getAttribute("maHS");
            String tenhs = hocsinh.getAttribute("tenHS");
            int tuoi = Integer.parseInt(hocsinh.getAttribute("tuoi"));
            HocSinh hs = new HocSinh(mahs, tenhs, tuoi);
            ds.add(hs);
            }
          for(HocSinh hs:ds){
               System.out.println(hs);
          }
           
            System.out.println("thanh cong");
              
        } catch (Exception e) {
            System.out.println("doc doi tuong that bai");
            e.printStackTrace();
        }
      
    }
    
}
