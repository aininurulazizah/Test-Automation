package com.calculator;

public class ValidasiKomputasi {
    public static int hitung(String operator, int operand1, int operand2) {
        // Validasi operand dan operator
        if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767) {
            throw new IllegalArgumentException("Error: Operand melebihi range yang diizinkan");
        }

        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Error: Operator tidak valid");
        }

        // Hitung hasil
        switch (operator) {
            case "+":
                return Penjumlahan.penjumlahan(operand1, operand2);
            case "-":
                return Pengurangan.pengurangan(operand1, operand2);
            case "*":
                return Perkalian.perkalian(operand1, operand2);
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Error: Pembagi tidak boleh nol");
                }
                return Pembagian.pembagian(operand1, operand2);
            default:
                throw new IllegalArgumentException("Error: Operator tidak valid");
        }
    }
}

