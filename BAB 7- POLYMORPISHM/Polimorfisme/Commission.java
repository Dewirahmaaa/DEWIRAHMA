package Polimorfisme;

public class Commission extends Employee{
        private double grossSales;//penjualan per minggu
        private double commissionRate;//komisi
        public Commission(String name, String noKTP, double sales, double rate, int tanggal, int bulan, int tahun){
            super(name, noKTP);
            setGrossSales(sales);
            setCommissionRate(rate);
        }
        public void setGrossSales(double sales){
            grossSales = sales;
        }
        public double getGrossSales(){
            return grossSales;
        }
        public void setCommissionRate(double rate){
            commissionRate = rate;
        }
        public double getCommissionRate(){
            return commissionRate;
        }
        public double earnings(){
            return getCommissionRate()*getGrossSales();
        }
        public String toString(){
            return String.format("Commision employee: "+super.toString()+"\ngross sales:"+getGrossSales()+"\ncommission rate"+getCommissionRate());
        }
    }

