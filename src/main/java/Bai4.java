
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Quoc Chung
 */
public class Bai4 {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x=scanner.nextInt();
        System.out.println("Nhap y: ");
        int y=scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float thuong=(float)(x/y*1.0);
        
        System.out.println("Tong: "+(x+y)+"\nHieu :" +(x-y)+"\nTich :"+(x*y)+"\nThuong :"+decimalFormat.format(thuong));
    }
}
