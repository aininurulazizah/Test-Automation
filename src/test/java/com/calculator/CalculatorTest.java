package com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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