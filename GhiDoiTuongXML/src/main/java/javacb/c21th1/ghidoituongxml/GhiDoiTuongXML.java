/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.c21th1.ghidoituongxml;

import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author KHOACNTT
 */
public class GhiDoiTuongXML {

    public static void main(String[] args) {
           ArrayList<HocSinh> ds = new ArrayList<>();
           ds.add( new HocSinh("A01", "NGuyen Van Hung", 20));
             ds.add( new HocSinh("A02", "NGuyen Van Hung", 20));
              ds.add( new HocSinh("A023", "NGuyen Van Hung", 20));
        try {
            DocumentBuilderFactory fatory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = fatory.newDocumentBuilder();
            Document document = builder.newDocument();
            Element dshocsinh = document.createElement("dshocsinh");
            document.appendChild(dshocsinh);
            for(HocSinh hs : ds){
                Element hocsinh= document.createElement("hocsinh");
                dshocsinh.appendChild(hocsinh);
                  hocsinh.setAttribute("maHS", hs.getMaHS());
            hocsinh.setAttribute("tenHS", hs.getTenHS());
            hocsinh.setAttribute("tuoi", hs.getTuoi() + "");
            }
          
            TransformerFactory transformfactory = TransformerFactory.newInstance();
            Transformer transformer = transformfactory.newTransformer();
            FileWriter writer = new FileWriter("data/hocsinh.xml");
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(document);
            transformer.transform(source, result);
            writer.close();
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println("that bai");
            e.printStackTrace();
        }
    }

}
