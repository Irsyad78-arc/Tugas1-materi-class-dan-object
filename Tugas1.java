package tugas1;

// Tidak perlu import Scanner kalau tidak digunakan
// import java.util.Scanner;

class Mobil {
    String mrek;
    String model;
    int taun;

    // Method untuk menampilkan informasi mobil
    void info() {
        System.out.println("====================================");
        System.out.println("Merek: " + mrek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + taun);
        System.out.println("====================================");
    }
}

public class Tugas1 {

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        mobil1.mrek = "Honda";
        mobil1.model = "Civic";
        mobil1.taun = 2021;

        Mobil mobil2 = new Mobil();
        mobil2.mrek = "Toyota";
        mobil2.model = "Supra";
        mobil2.taun = 2025;

        // Memanggil method info dari objek mobil
        mobil1.info();
        mobil2.info();
    }
}
