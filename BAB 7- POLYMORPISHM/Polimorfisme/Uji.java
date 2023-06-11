import Polimorfisme.Employee;

public class Uji {
    public static void main(String[] args) {
        Employee peg1 = new GajiByJumlah("jalal", "111", 5);
        Employee peg2 = new GajiByJumlah("roro", "222", 10);
        Employee peg3 = new GajiByJumlah("farel", "333", 15);
        Employee peg4 = new GajiByJumlah("deboy", "444", 20);
        
        Employee[] employees = new Employee[4];
        employees[0] = peg1;
        employees[1] = peg2;
        employees[2] = peg3;
        employees[3] = peg4;

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("pendapatan : $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
