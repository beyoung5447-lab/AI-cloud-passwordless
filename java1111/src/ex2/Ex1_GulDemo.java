package ex2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_GulDemo extends JFrame {
    private JPanel jp1, jp2;
    private JButton btn1;

    public Ex1_GulDemo() {
        setTitle("엥 호출이 되네?");
        
        jp1 = new JPanel();
        jp2 = new JPanel();
        
        btn1 = new JButton("Click");
        jp1.add(btn1);
        
        
        jp2.setBackground(Color.GRAY);
        jp2.setOpaque(true);
        
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp2.setBackground(Color.ORANGE);
            }
        });
        
        
        add(jp1, "North");
        add(jp2, "Center");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 20, 300, 200);
        setVisible(true);
    }

   
    public static void main(String[] args) {
        new Ex1_GulDemo();
    }
}