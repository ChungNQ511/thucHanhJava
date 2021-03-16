
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
public class Bai7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[], n;
        do {
            System.out.println("Nhap n: ");
            n = scan.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lai!");
            }
        } while (n <= 0);
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]: ");
            a[i] = scan.nextInt();
        }
        //xuat so nguyen to
        System.out.print("So nguyen to trong mang: ");
        int demnt = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(a[i]) == true) {
                demnt++;
                System.out.println(a[i] + " ");
            }
        }
        if (demnt == 0) {
            System.out.println("Mang khong co so nguyen to.");
        }
        //xuat phan tu lon nhat
        int sln = a[0];
        for (int i = 1; i < n; i++) {
            sln = SoSanh(sln, a[i]);
        }
        System.out.println("So lon nhat: " + sln);
        //so chinh phuong
        System.out.print("So chinh phuong trong mang: ");
        int sl = 0;
        for (int i = 0; i < n; i++) {
            if (checkPerfectSquare(a[i])) {
                sl++;
                System.out.println(a[i] + " ");
            }
        }
        System.out.println("Co " + sl + " so chinh phuong.");
        //sap xep mang tang dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Mang sau sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
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

    public static int SoSanh(int a, int b) {
        int kq;
        if (a >= b) {
            kq = a;
        } else {
            kq = b;
        }
        return kq;
    }

    static boolean checkPerfectSquare(int x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

}
