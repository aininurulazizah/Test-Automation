## Pengujian Unit Program Kalkulator Dengan Whitebox Automation Testing ##

### Deskripsi Program ###
Program Kalkulator Sederhana adalah program yang memungkinkan pengguna untuk melakukan operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian. 

Program ini memiliki batasan tertentu dalam penggunaannya, seperti: 
1. Operasi yang dapat dilakukan terbatas pada operasi tambah (+), kurang (-), kali (*), dan bagi (/) 
2. Terdapat batasan pada range angka yang dapat dimasukkan, yaitu dari -32768 hingga 32767. 
3. Untuk operasi pembagian, pembagian dengan angka nol tidak dapat dilakukan sehingga akan ditampilkan pesan kesalahan. 

Untuk mengoperasikan kalkulator, pengguna akan diminta untuk: 
1. Memasukkan operand pertama 
2. Memasukkan operand kedua 
3. Memasukkan operator yang diinginkan 
4. Lalu, program akan menghitung hasil operasi sesuai dengan operator yang dimasukkan dan menampilkan hasilnya. Jika terdapat kesalahan, maka program akan menampilkan pesan kesalahan yang sesuai. 


### Prerequisite ###
- **IntelliJ** sebagai IDE pengembangan program. Anda dapat menggunakan IDE lain yang mendukung pemrograman Java seperti VSCode atau Eclipse IDE
- **Java 11** sebagai bahasa pemrograman yang digunakan dalam mengembangkan program
- **Gradle 8.6** sebagai alat otomatisasi build yang kuat untuk mengelola dependensi, mengkonfigurasi proyek, dan mengeksekusi tugas-tugas build.
- **JUnit 5** sebagai pustaka pengujian unit untuk Java yang memungkinkan pengembang untuk menulis dan menjalankan pengujian unit

### Struktur Project ###
```
.
├── src
│   ├── main/java/com/calculator
│   │   ├── MainApp.java
│   │   ├── Pembagian.java
│   │   ├── Pengurangan.java
│   │   ├── Penjumlahan.java
│   │   ├── Perkalian.java
│   │   └── ValidasiKomputasi.java
│   └── test/java/com/calculator
│        └── CalculatorTest.java
```

### Cara Instalasi ###
1. Clone repositori dengan menjalankan perintah
```
git clone https://github.com/aininurulazizah/Test-Automation.git
```
2. Buka proyek menggunakan IDE. Proses instalasi JavaBuild akan dilakukan secara otomatis ketika proyek dibuka dan tunggu hingga proses instalasi selesai.

### Menjalankan Program ###
1. Pastikan anda berada dalam direktori `src/main/java`
2. Ketik perintah berikut dalam terminal untuk menjalankan program:
```
java com.calculator.MainApp
```

### Menjalankan Testing ###
1. Pastikan anda berada pada direktori `Test-Automation`
2. Jalankan perintah :
```
gradlew test
```

### Mengakses Test Report ###
Untuk melihat test report hasil pengujian dapat diakses melalui direktori : 
`build\reports\tests\test\index.html`


### Nama Aggota ###
1. Aini Nurul Azizah (211524034)
2. Amelia Nathasa (211524036)
3. Nayara Saffa (211524052)
