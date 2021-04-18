
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
public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();
        int ucln = 1, bcnn = x * y;
        if (x >= y) {
            for (int i = 2; i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    ucln = i;
                }
            }
        } else {
            for (int i = 2; i <= x; i++) {
                if (x % i == 0 && y % i == 0) {
                    ucln = i;
                }
            }
            for (int i = 1; i < bcnn; i++) {
                if (i % x == 0 && i % y == 0) {
                    bcnn = i;
                }
            }
            System.out.println("UCLN: " + ucln + "\nBCNN :" + bcnn);
        }
    }
}
