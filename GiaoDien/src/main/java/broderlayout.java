
import java.awt.BorderLayout;
import java.awt.Color;
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
public class broderlayout extends JFrame {

    public broderlayout() {
    }

    public  void khoitao() {
        this.setTitle("m noi gi m doi di");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        this.setLayout(new BorderLayout());
        JButton btn1 = new JButton("Ben tren");
        btn1.setForeground(Color.red);
        this.add(btn1,BorderLayout.NORTH);
        JButton btn2 = new JButton("Ben duoi");
           btn2.setForeground(Color.BLUE);
          this.add(btn2,BorderLayout.EAST);
        JButton btn3 = new JButton("Ben trai");
         btn3.setForeground(Color.PINK);
          this.add(btn3,BorderLayout.SOUTH);
        JButton btn4 = new JButton("Ben phai");
          this.add(btn4,BorderLayout.WEST);
        JButton btn5 = new JButton("center");
          this.add(btn5,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
      broderlayout f1 = new broderlayout();
         f1.khoitao();
    }
}
