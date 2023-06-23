
import java.awt.FlowLayout;
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
public class flowlayuot  extends JFrame{

    public flowlayuot() {
    }
    
     public  void khoitao(){
          this.setTitle("m noi gi m doi di");
        this.setSize(400, 300);
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
         for (int i = 0; i < 10; i++) {
             JButton button = new JButton(i+"");
             this.add(button);
         }

        this.setVisible(true);
    }
     public static void main(String[] args) {
        flowlayuot f1 = new flowlayuot();
        f1.khoitao();
    }
}
