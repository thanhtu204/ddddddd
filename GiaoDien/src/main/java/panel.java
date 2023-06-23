
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KHOACNTT
 */
public class panel extends JFrame {

    public panel() {
    }

    public void khoitao() {
        this.setTitle("m noi gi m doi");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField(20);
        this.add(jTextField);
        Panel panelcenter = new Panel();
        panelcenter.setLayout(new GridLayout(4, 6));
        for (int i = 0; i < 24; i++) {
            JButton button = new JButton(i + "");
            panelcenter.add(button);
        }
        this.add(panelcenter, BorderLayout.CENTER);
        Panel bentrai = new Panel(new GridLayout(4, 1));
        JButton cong = new JButton("+");
        bentrai.add(cong);
        JButton tru = new JButton("-");
        bentrai.add(tru);
        JButton nhan = new JButton("*");
        bentrai.add(nhan);
        JButton chia = new JButton("/");
        bentrai.add(chia);
       this.add(bentrai,BorderLayout.WEST);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        panel f1 = new panel();
        f1.khoitao();
    }
}
