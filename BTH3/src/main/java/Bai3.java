import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Bai3 extends JFrame{
    private static final long serialVersionUID = 1L;
    public Bai3(String title){
        setTitle(title);
        JPanel pnFl = new JPanel();
        pnFl.setLayout(new FlowLayout());
        pnFl.setBackground(Color.PINK);
        JButton btn1= new JButton("FlowLayout");
        JButton btn2= new JButton("Add cac control");
        JButton btn3= new JButton("Tren 1 dong");
        JButton btn4= new JButton("Het cho chua");
        JButton btn5= new JButton("Thi xuong dong");
        pnFl.add(btn1);
        pnFl.add(btn2);
        pnFl.add(btn3);
        pnFl.add(btn4);
        pnFl.add(btn5);        Container con = getContentPane();
        con.add(pnFl);
        
    }
    public static void main(String[] args) {
        Bai3 myUI = new Bai3("Demo Layout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
