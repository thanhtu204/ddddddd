

import java.awt.GridLayout;
import javax.swing.JButton;
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
public class grilayout  extends JFrame{

    public grilayout() {
    }
    
     public  void khoitao(){
          this.setTitle("m noi gi m doi di");
        this.setSize(400, 300);
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         this.setLayout(new GridLayout(5,4));
         for (int i = 0; i < 20; i++) {
             JButton button = new JButton(i+"");
             this.add(button);
         }

        this.setVisible(true);
    }
     public static void main(String[] args) {
        grilayout f1 = new grilayout();
        f1.khoitao();
    }
}
