package PRATIKUM2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Methodfile {
    private String judul;
    private String penulis;

    public Methodfile() {
        this.judul = "";
        this.penulis = "";
    }
    // method yang menerima parameter namaFile untuk menunjukkan nama file yang akan disimpan//
    public void simpanFile(String namaFile) { 
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile));
            writer.write(this.judul + "; " + this.penulis);
            writer.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }
}
 
