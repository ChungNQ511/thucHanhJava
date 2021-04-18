import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) throws Exception {
        String fileName = "";
        File f = new  File("");
        fileName = f.getAbsolutePath() + "\\src\\fileioexam2\\data1.txt";
        f = new File(fileName);
        if(f.exists()){
            System.out.println("File da ton tai");
            System.exit(0);
        }
        PrintWriter pw = new PrintWriter(f);
        pw.print("Copy right by Duong Thanh Phet");
        pw.println(2015);
        pw.print("http://thayphet.net");
        System.out.println("Da ghi file xong");
        Scanner input = new Scanner(f);
        while(input.hasNext()){
            String ten = input.nextLine();
            System.out.println(ten + " ");
            int maso = input.nextInt();
            System.out.println(maso);
        }
    }
}
