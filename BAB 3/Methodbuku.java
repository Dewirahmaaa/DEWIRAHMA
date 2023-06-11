package PRATIKUM2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Methodbuku {
    private String judul;
    private String penulis;

    public Methodbuku() {
        this.judul = "";
        this.penulis = "";
    }
    public void bacaFile(String pathFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line = reader.readLine();
            String[] data = line.split("; ");
            this.judul = data[0];
            this.penulis = data[1];
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
    
