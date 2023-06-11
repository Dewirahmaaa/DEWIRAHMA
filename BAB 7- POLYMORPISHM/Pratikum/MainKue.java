package Pratikum;
public class MainKue {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KueJadi("Kue Lumpur", 2000, 5);
        kueArray[1] = new KueJadi("Kue Cucur", 3000, 5);
        kueArray[2] = new KueJadi("Kue Lapis", 2500, 4);
        kueArray[3] = new KueJadi("Kue Bolu", 4000, 3);
        kueArray[4] = new KueJadi("Kue pisang", 3500, 2);
        kueArray[5] = new KuePesanan("Kue Tart", 4000, 2);
        kueArray[6] = new KuePesanan("Kue Nagasari", 2000, 1);
        kueArray[7] = new KuePesanan("Kue Croissant", 2000, 3.5);
        kueArray[8] = new KuePesanan("Kue pancong", 4000, 4);
        kueArray[9] = new KuePesanan("Kue kering", 7000, 5);
        kueArray[10]=new KuePesanan("Putu Ayu",7000, 4);
        kueArray[11]= new KuePesanan("Puteri Salju", 3000, 1);
        kueArray[12] = new KuePesanan("kue Kacang", 8000, 2);
        kueArray[13]= new KuePesanan("kue Onde-onde", 4000, 2);
        kueArray[14]= new KuePesanan("Kue Serabi", 5000, 3);
        kueArray[15] = new KuePesanan("Kue Lumpia", 3000, 2);
        kueArray[16] = new KuePesanan("Kue Lemper", 3000, 2);
        kueArray [17] = new KuePesanan("Kue Gethuk", 2000, 3);
        kueArray[18] = new KuePesanan("Kue Klepon", 5000, 4);
        kueArray [19] = new KuePesanan("Kue Dadar gulung", 2000, 2);
        System.out.println("Daftar Kue  : ");
        for (Kue kue : kueArray) {
            System.out.println(kue.toString());
        }
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("total harga semua jenis kue : " + totalHarga);
        double harga = 0;
        double berat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                harga += kue.hitungHarga();
                berat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total harga Kue Pesanan: " + harga);
        System.out.println("Total berat Kue Pesanan: " + berat);
        double rego = 0;
        double jumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                rego += kue.hitungHarga();
                jumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total harga Kue Pesanan: " + rego);
        System.out.println("Total berat Kue Pesanan: " + jumlah);
        Kue kueTermahal = kueArray[0];
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("Kue dengan harga terbesar: \n" + kueTermahal.toString());
    }
}
