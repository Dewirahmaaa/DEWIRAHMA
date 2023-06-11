package Polimorfisme;
    public class BasePlusCommissionEmployee extends Commission {
private double baseSalary;//gaji pokok tiap minggu
public BasePlusCommissionEmployee(String name, String
noKTP, double sales, double rate, double salary, int tanggal, int bulan , int tahun) {
super(name, noKTP, sales, rate, tanggal, bulan, tahun);
setBaseSalary(salary);
}
public void setBaseSalary(double salary) {
baseSalary = salary;
}
public double getBaseSalary() {
return baseSalary;
}
public double earnings() {
return getBaseSalary() + super.earnings();
}
public String toString() {
return String.format("Base-Salaried " +super.toString() + "\nbase salary " + getBaseSalary());
}
}

