import javax.swing.*;
import java.awt.event.*;
public class SimpleNotepad {
    public static void main(String[] args) {
        JFrame f = new JFrame("Notepad");
        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(0, 0, 400, 400);
        f.add(scroll);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}