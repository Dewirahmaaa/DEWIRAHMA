package PEMLAN;
    public class Manusia {
        private String nama;
        private int jumlahPembelianBuah;
    
        public Manusia(String nama, int jumlahPembelianBuah) {
            this.nama = nama;
            this.jumlahPembelianBuah = jumlahPembelianBuah;
        }
    
        public String getNama() {
            return nama;
        }
    
        public int getJumlahPembelianBuah() {
            return jumlahPembelianBuah;
        }
    }
    public class buah {
    class Buah {
        private String nama;
        private int jumlahBuah;
    
        public Buah(String nama, int jumlahBuah) {
            this.nama = nama;
            this.jumlahBuah = jumlahBuah;
        }
    
        public String getNama() {
            return nama;
        }
    
        public int getJumlahBuah() {
            return jumlahBuah;
        }
    
        public void kurangiJumlahBuah(int jumlah) {
            jumlahBuah -= jumlah;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            // Inisialisasi objek buah dan manusia
            Buah buah = new Buah("manggis", 8);
            Manusia manusia = new Manusia("Pak Tejo", 0);
    
            // Ambil input jumlah pembelian buah dari user
            int jumlahPembelian = 4;
    
            // Lakukan checkout
            if (jumlahPembelian <= buah.getJumlahBuah()) {
                buah.kurangiJumlahBuah(jumlahPembelian);
                System.out.println("Berhasil checkout buah");
                System.out.println("Sisa buah = " + buah.getJumlahBuah());
            } else {
                System.out.println("Gagal checkout buah");
            }
        }
    }
    
    
}
