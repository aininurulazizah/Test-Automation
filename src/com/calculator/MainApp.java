package com.calculator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input operand1
        System.out.print("Masukkan operand 1: ");
        int operand1 = scanner.nextInt();

        // Input operand2
        System.out.print("Masukkan operand 2: ");
        int operand2 = scanner.nextInt();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();

        try {
            // Hitung dan tampilkan hasil
            int hasil = ValidasiKomputasi.hitung(operator, operand1, operand2);
            System.out.println("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa angka");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
