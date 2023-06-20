/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocvaGhi;

import java.io.FileWriter;
import java.util.stream.Stream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
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
public class Ghi2doituong {
    public static void main(String[] args) {
         HocSinh hs = new HocSinh("A001", "Nguyen Thi Loan", 19);
        try {
             // tao 2 doi tuong sau de phan tich, xu ly duoc tai lieu xtml
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    // tao doi tuong tai lieu xml
    Document document = builder.newDocument();
    // tao the (nut-node-element)
    Element hocsinh= document.createElement("hocsinh");
    // then the vua tao vao tai lieu 
    document.appendChild(hocsinh);
    //tao lan luot cac the con va them vap the cha hoc sinh
    hocsinh.setAttribute("maHS", hs.getMaHS());
     hocsinh.setAttribute("tenHS", hs.getTenHS());
      hocsinh.setAttribute("tuoi", hs.getTuoi()+"");
    //ghi tai lieu xml vao tap tin
            TransformerFactory transformfactory = TransformerFactory.newInstance();
            Transformer transfomer = transformfactory.newTransformer();
            FileWriter writer = new FileWriter("src/data/ghidoituong2.xml");
            StreamResult result= new StreamResult(writer);
            DOMSource source = new DOMSource(document);
            // cho phep xuong dong cho cac the
            transfomer.setOutputProperty(OutputKeys.INDENT, "yes");
            transfomer.transform(source, result);
            System.out.println("thanh cong");
            writer.close();
        } catch (Exception e) {
            System.out.println("thatbai");
        }
  
    
    }
  
}

