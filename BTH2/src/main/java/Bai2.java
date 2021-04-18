
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
public class Bai2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so luong so n = ");
        int n = Bai2.scanner.nextInt();
        int a[];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            a[i] = (int) randomDouble;
        }
        System.out.println("Mang vua sinh la: ");
        XuatMang(a, n);
        System.out.println("\nSo nguyen to trong mang :");
        for(int i=0;i<n;i++){
            if(isPrimeNumber(a[i]))
                System.out.println("\t " + a[i]);
        }
    }
    public static void XuatMang(int a[], int n) {
        for(int i=0;i<n;i++){
            System.out.print("\ta["+i+"] = " + a[i]);
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
