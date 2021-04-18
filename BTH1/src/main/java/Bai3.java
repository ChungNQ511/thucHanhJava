
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        String masv = x.nextLine();
        System.out.println("Nhap ho ten: ");
        String ht = x.nextLine();
        System.out.println("Nhap tuoi: ");
        byte tuoi = x.nextByte();
        System.out.println("Nhap Nam Sinh: ");
        byte ns = x.nextByte();
        System.out.println("Nhap Diem Trung Binh: ");
        byte dtb = x.nextByte();
        System.out.println("INFORMATION \nMSSV: " + masv + "\nHo Ten: " + ht + "\nTuoi: " + tuoi + "\nNam Sinh: " + ns + "\n Diem Trung Binh: " + dtb);
    }
}
