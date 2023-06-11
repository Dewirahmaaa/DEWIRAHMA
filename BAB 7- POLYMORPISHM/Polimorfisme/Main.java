package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel ", "135", 800.00, 25, 5, 1995);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, 25, 11, 2003);
        Commission commissionEmployee = new Commission("Keanu", "145", 10000, .06, 3, 2, 1992);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, 30, 1, 1990);
        
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println(salariedEmployee);
        if (salariedEmployee instanceof SalariedEmployee){
            SalariedEmployee employee = (SalariedEmployee) salariedEmployee;
            if (employee.getBulan()==5){
                employee.setWeeklySalary(4 * employee.getWeeklySalary() + 100000);
                System.out.printf("Bulan ini adalah ulang tahunnya.\n" + "Lahir pada " + employee.gettanggallahir() + "\n" + "Gaji setelah ditambah 100000: $%.2f\n", employee.getWeeklySalary());
            }
        }
        System.out.printf("Pendapatan: $%.2f\n\n", salariedEmployee.earnings());
    }
}
