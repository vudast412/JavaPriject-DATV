import java.util.Scanner;

public class StudentHTTT extends Student {
    private float fee;
    
    public StudentHTTT() {}

    public StudentHTTT(float fee) {
        this.fee = fee;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter your fee: ");
        fee = scanner.nextFloat();
    }

    public String getInfo() {
        return getPersonalInfo() + "\nFee: " + fee; 
    }

}