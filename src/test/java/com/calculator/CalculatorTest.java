package com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class CalculatorTest {

    //    Test Modul Penjumlahan
    @Test
    public void M3TC1penjumlahanTest() {
        int hasil = Penjumlahan.penjumlahan(10,5);
        Assertions.assertEquals(15, hasil);
    }

    //    Test Modul Pengurangan
    @Test
    public void M4TC1penguranganTest() {
        int hasil = Pengurangan.pengurangan(10,5);
        Assertions.assertEquals(5, hasil);
    }

    //    Test Modul Perkalian
    @Test
    public void M5TC1perkalianTest() {
        int hasil = Perkalian.perkalian(10,5);
        Assertions.assertEquals(50, hasil);
    }

    //    Test Modul Pembagian
    @Test
    public void M6TC1pembagianTest() {
        int hasil = Pembagian.pembagian(10,5);
        Assertions.assertEquals(2, hasil);
    }


}

class MainTest {

        private final InputStream systemIn = System.in;
        private final PrintStream systemOut = System.out;

        private ByteArrayInputStream testIn;
        private ByteArrayOutputStream testOut;

        @BeforeEach
        public void setUpOutput() {
            testOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(testOut));
        }

        @AfterEach
        public void restoreSystemInputOutput() {
            System.setIn(systemIn);
            System.setOut(systemOut);
        }

        private void provideInput(String data) {
            testIn = new ByteArrayInputStream(data.getBytes());
            System.setIn(testIn);
        }

        private String getOutput() {
            return testOut.toString();
        }

        //  Test Case Input Operands dan Operator Valid
        @Test
        public void M1TC1OperatorOperandValid() {
            provideInput("10\n4\n+\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Hasil: 14", actualOutput);
        }

        //  Test Case Input Operand Pertama Bukan Angka
        @Test
        public void M1TC2Operand1BukanAngka() {
            provideInput("x\n5\n/\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Input harus berupa angka", actualOutput);
        }

        //  Test Case Input Operand Kedua Bukan Angka
        @Test
        public void M1TC3Operand2BukanAngka() {
            provideInput("17\ny\n*\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Input harus berupa angka", actualOutput);
        }

        //  Test Case Input Kedua Operands Bukan Angka
        @Test
        public void M1TC4Operand1dan2BukanAngka() {
            provideInput("a\nb\n-\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Input harus berupa angka", actualOutput);
        }

        //  Test Case Input Operator Tidak Valid
        @Test
        public void M1TC5OperatorInvalid() {
            provideInput("56\n7\n&\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operator tidak valid", actualOutput);
        }

        //  Test Case Input Operands Pertama Melebihi Range Bawah
        @Test
        public void M1TC6Operand1MelewatiBatasBawah() {
            provideInput("-35000\n20\n+\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Kedua Melebihi Range Bawah
        @Test
        public void M1TC7Operand2MelewatiBatasBawah() {
            provideInput("20\n-35000\n-\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Pertama Melebihi Range Atas
        @Test
        public void M1TC8Operand1MelewatiBatasAtas() {
            provideInput("35000\n30\n*\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Kedua Melebihi Range Atas
        @Test
        public void M1TC9Operand2MelewatiBatasAtas() {
            provideInput("30\n35000\n/\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Kedua Operands Melebihi Range Atas
        @Test
        public void M1TC10Operand1dan2MelewatiBatasAtas() {
            provideInput("35000\n35000\n+\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Kedua Operands Melebihi Range Bawah
        @Test
        public void M1TC11Operand2MelewatiBatasBawah() {
            provideInput("-35000\n-35000\n-\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Pertama Melebihi Range Atas dan Kedua Melebihi Range Bawah
        @Test
        public void M1TC12Operand1MelewatiBatasAtasOperand2MelewatiBatasBawah() {
            provideInput("35000\n-35000\n*\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Pertama Melebihi Range Bawah dan Kedua Melebihi Range Atas
        @Test
        public void M1TC13Operand1MelewatiBatasBawahOperand2MelewatiBatasAtas() {
            provideInput("-35000\n35000\n/\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Operand melebihi range yang diizinkan", actualOutput);
        }

        //  Test Case Input Operand Pembagi Kedua Nol
        @Test
        public void M1TC14PembagiOperand2Nol() {
            provideInput("60\n0\n/\n");
            MainApp.main(null);
            String actualOutput = getOutput().toString().trim();
            assertEquals("Masukkan operand 1: Masukkan operand 2: Masukkan operator (+, -, *, /): Error: Pembagi tidak boleh nol", actualOutput);
        }

}

class Validasi {
    @Test
    public void M2TC1Operand1MelebihiRangeAtasTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", 40000, 10000 );
        });
    }

    @Test
    public void M2TC2Operand1MelebihiRangeBawahTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", -40000, 10000 );
        });
    }

    @Test
    public void M2TC3Operand2MelebihiRangeAtasTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", 10000, 40000 );
        });
    }

    @Test
    public void M2TC4Operand2MelebihiRangeBawahTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", -10000, -40000 );
        });
    }

    @Test
    public void M2TC5KeduaOperandMelebihiRangeAtasTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", 40000, 40000 );
        });
    }

    @Test
    public void M2TC6Operand1MelebihiRangeBawahTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", -40000, -40000 );
        });
    }

    @Test
    public void M2TC7Operand1MelebihiRangeAtasOperand2MelebihiRangeBawahTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", 40000, -40000 );
        });
    }

    @Test
    public void M2TC8Operand1MelebihiRangeBawahOperand2MelebihiRangeAtasTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("+", -40000, 40000 );
        });
    }

    @Test
    public void M2TC9TC15OperatorTidakValidTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ValidasiKomputasi.hitung("!", 10000, 10000 );
        });
    }

    @Test
    public void M2TC10ValidasiInputOperatorTambahTest(){
        int hasil = ValidasiKomputasi.hitung("+",40,10);
        Assertions.assertEquals(50,hasil);
    }

    @Test
    public void M2TC11ValidasiInputOperatorKurangTest(){
        int hasil = ValidasiKomputasi.hitung("-",40,10);
        Assertions.assertEquals(30,hasil);
    }

    @Test
    public void M2TC12ValidasiInputOperatorKaliTest(){
        int hasil = ValidasiKomputasi.hitung("*",40,10);
        Assertions.assertEquals(400,hasil);
    }

    @Test
    void M2TC13validasiPembagian0(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            ValidasiKomputasi.hitung("/", 400, 0);
        });
    }
    @Test void M2TC14validasiPembagian(){
        int hasil = ValidasiKomputasi.hitung("/",400,200);
        Assertions.assertEquals(2,hasil);
    }
}