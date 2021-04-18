
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Locale;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai4 extends JFrame{
    private static final long serialVersionUID = 1L;
    public Bai4(String title){
        setTitle(title);
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1= new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font = new Font("Arial",Font.BOLD|Font.ITALIC,25);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.blue);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3= new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);
        Container con = getContentPane();
        con.add(pnBox);
    }
    public static void main(String[] args) {
        Bai4 myUI = new Bai4("Box Layout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
