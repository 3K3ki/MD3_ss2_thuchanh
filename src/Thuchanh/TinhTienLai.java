package Thuchanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("NHap so tien gui:");
        money = input.nextDouble();
        System.out.println("Nhap so thang gui:");
        month = input.nextInt();
        System.out.println("Nhap so rate:");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 *month;
        }
        System.out.println("So tien lai la:"+totalInterest);
    }
}
