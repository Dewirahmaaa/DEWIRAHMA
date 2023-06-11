package Polimorfisme;
    public abstract class Employee {
        private String name;
        private String noKTP;
        private String tanggallahir;
        private int tanggal,bulan,tahun;

        public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;

        setTanggalLahir(tanggal,bulan,tahun);
        setBulan(bulan);
        }
        public String getName(){
        return name;
        }
        public String getNoKTP(){
        return noKTP;
        }
        public String toString(){
        return String.format(" "+getName()+"\nNo. KTP:"+getNoKTP());
        }
        public void setTanggalLahir(int tanggal, int bulan, int tahun){
            tanggallahir = tanggal + "-" + bulan + "-" + tahun;
        }
        public String gettanggallahir(){
            return tanggallahir;
        }
        public void setBulan (int bulan){
            this.bulan = bulan;
        }
        public abstract double earnings();//pendapatan
        }

