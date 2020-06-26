import java.util.Scanner;

public class StudentUTT extends Student {
    private float unit, salay;

    public StudentUTT() {
    }

    public StudentUTT(float unit, float salary) {
        this.unit = unit;
        this.salay = salary;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter your unit: ");
        unit = scanner.nextFloat();
        System.out.println("Enter your salary: ");
        salay = scanner.nextFloat();
    }

    public String getInfo() {
        return getPersonalInfo() + "\nUnit: " + unit + "\nSalary: " + salay; 
    }
}