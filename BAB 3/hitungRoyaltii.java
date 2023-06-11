package PRATIKUM2;
public class hitungRoyaltii{
    public static void main(String[] args){
    }
    public double hitungRoyalti(double hargaBuku) {
        // Menghitung royalti berdasarkan harga buku dan 10% penjualan bulan ini
        double persenPenjualan = 10.0;
        double royalti = hargaBuku * persenPenjualan / 100.0;
        return royalti;
    }
    
}
