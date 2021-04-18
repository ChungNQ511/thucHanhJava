
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
public class Bai3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a[][], dong, cot;
        System.out.println("Nhap so dong = ");
        dong = scanner.nextInt();
        System.out.println("Nhap so cot = ");
        cot = scanner.nextInt();
        System.out.println("Nhap dong muon tinh tong : ");
        int k =scanner.nextInt();
        a = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                a[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println("Mang vua nhap :");
        XuatMang(a,dong, cot);
        
        // Tinh Tong//
        int Sum=0;
        for(int i = 0; i < cot; i++){
            Sum = Sum + a[k][i];
        }
        System.out.println("\nTong cua dong " + k + "la :" + Sum);
    }

    public static void XuatMang(int a[][], int d, int c) {
        for (int i = 0; i < d; i++) {
            System.out.println("");
            for (int j = 0; j < c; j++) {
                System.out.print("\ta[" + i + "][" + j + "] = " + a[i][j]);
            }
        }
    }
}
