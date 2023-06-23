
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class MyWindow extends JFrame{

    public static void MyWindow() {
        JFrame frame = new  JFrame();
    }
    public  void khoitao(){
          this.setTitle("m noi gi m doi di");
        this.setSize(500, 800);
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow m = new MyWindow();
        m.khoitao();
    }
   
}
