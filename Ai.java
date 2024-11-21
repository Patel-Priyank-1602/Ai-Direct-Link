import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;

public class Ai {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Open Website Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(715, 540);
        frame.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,28);

        ImageIcon BI1 = new ImageIcon("C:\\Users\\patel\\OneDrive\\Documents\\Desktop\\SEM 3\\# Git Hub\\For Work\\ChatGPT.jpg");
        ImageIcon BI3 = new ImageIcon("C:\\Users\\patel\\OneDrive\\Documents\\Desktop\\SEM 3\\# Git Hub\\For Work\\Gemini.jpg");
        ImageIcon BI2 = new ImageIcon("C:\\Users\\patel\\OneDrive\\Documents\\Desktop\\SEM 3\\# Git Hub\\For Work\\Copilet.jpg");

        JButton B1 = new JButton(BI1);
        JButton B2 = new JButton(BI2);
        JButton B3 = new JButton(BI3);
        
        B1.setBounds(277, 175, 150, 150);  
        B2.setBounds(70, 175, 150, 150); 
        B3.setBounds(485, 175, 150, 150);
        
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URI website = new URI("https://chatgpt.com/");
                    Desktop.getDesktop().browse(website);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URI website = new URI("https://copilot.microsoft.com/");
                    Desktop.getDesktop().browse(website);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URI website = new URI("https://gemini.google.com/");
                    Desktop.getDesktop().browse(website);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.add(B1);
        frame.add(B2);
        frame.add(B3);

        ImageIcon bgIcon = new ImageIcon("C:\\Users\\patel\\OneDrive\\Documents\\Desktop\\SEM 3\\# Git Hub\\For Work\\Frame Hori.jpeg");
        JLabel background = new JLabel(bgIcon);
        background.setBounds(0, 0, 700, 500);
        frame.add(background);
        
        frame.setVisible(true);
    }
}
