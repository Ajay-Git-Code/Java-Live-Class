package swingdemo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {

    private JButton btn;
    private JLabel jl;

    public void create() {
        JFrame jf = new JFrame("Application");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        jf.setBounds(d.width / 4, d.height / 4, d.width / 2, d.height / 2);
        jf.setLayout(new FlowLayout());
        jl = new JLabel();
        btn = new JButton("Click me");
        jf.add(btn);
        jf.add(jl);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jl.setText("Clicked");
            }
        });
    }

    public static void main(String[] args) {
        SwingDemo obj = new SwingDemo();
        obj.create();
    }

//    class ButtonAction implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            //JButton btn = (JButton)e.getSource();
//            //btn.setText("Clicked");
//            jl.setText("Clicked");
//        }
//    }
}
