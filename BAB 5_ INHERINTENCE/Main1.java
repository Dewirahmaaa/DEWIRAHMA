package INHERINTENCE;
import java.time.LocalDate;
public class Main1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Jalal", "111", true, true);
        System.out.println(manusia1.toString());
        System.out.println("===========================================");
        
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("225150407111018", 4.0, "Dewi Rahma", "1110344", false, false);
        System.out.println(mahasiswa1.toString());
        System.out.println("===========================================");

        Pekerja pekerja1 = new Pekerja(1000.0, LocalDate.of(2016, 3, 2), 3, "Rangga H", "111", true, true);
        System.out.println(pekerja1.toString());
        System.out.println("===========================================");

        Manager1 manager1 = new Manager1("HRD", 1000.0, LocalDate.of(2017, 1, 2), 3, "Putera Aldi", "111", true, true);
        System.out.println(manager1.toString());
        System.out.println("===========================================");

    }
}
