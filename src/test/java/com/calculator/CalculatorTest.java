package com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testPenjumlahan(){
        int hasil = ValidasiKomputasi.hitung("+",10,10);
        Assertions.assertEquals(20, hasil);
    }

    @Test
    public void testPengurangan(){
        int hasil = ValidasiKomputasi.hitung("-",10,10);
        Assertions.assertEquals(0, hasil);
    }

    @Test
    public void testPerkalian(){
        int hasil = ValidasiKomputasi.hitung("*",10,10);
        Assertions.assertEquals(100, hasil);
    }

    @Test
    public void testPembagian(){
        int hasil = ValidasiKomputasi.hitung("/",10,10);
        Assertions.assertEquals(1, hasil);
    }

    @Test
    public void testAmbangBatas(){
        String operator = "-";
        int operand1 = -32769;
        int operand2 = -32769;

        try{
            int hasil = ValidasiKomputasi.hitung(operator, operand1, operand2);
            Assertions.fail("Seharusnya terjadi pengecualian");
        } catch (Exception e){
            Assertions.assertEquals("Error: Operand melebihi range yang diizinkan", e.getMessage());
        }
    }
}