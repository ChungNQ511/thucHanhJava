import javax.swing.JOptionPane;
public class Bai6 {
    public static void main(String[] args) {
        int n;
        try{
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen: ",""));
        }catch(java.lang.NumberFormatException e1){
            System.out.println(e1.toString());
        }finally{
            System.out.println("Have good fun");
        }
    }
}
