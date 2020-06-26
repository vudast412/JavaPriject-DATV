import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~Welcome To DATV~~~~~~~~~~");
        System.out.println("Please!!! Checck 1 in 2");
        System.out.println("1. Student HTTT: ");
        System.out.println("2. Student UTT: ");
        System.out.println("3. Exit program");
        while (true) {
            System.out.println("Enter number: ");
            int n = scanner.nextInt();
            System.out.println("Number you enter: " + n);

            if (n == 3) {
                System.out.println("Closing program...");
                break;
            }
            System.out.println("/!\\ Enter Information /!\\");

            if (n == 1) {
                StudentHTTT svhttt = new StudentHTTT();
                svhttt.input(scanner); // Nhập xuát với scanner đã khởi tạo (tránh khởi tạo scanner nhiều lần gây chậm program)
                try {
                    File file = new File("D:/studenthttt.dat");                   
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    System.out.println(svhttt.getInfo()); // In thông tin ra console
                    writer.write(svhttt.getInfo()); // Viết thông tin ra file
                    writer.close(); // Đóng kết nối sau khi viết
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else if (n == 2) {
                StudentUTT svutt = new StudentUTT();
                File file = new File("D:/studentutt.dat");
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    System.out.println(svutt.getInfo()); // In thông tin ra console
                    writer.write(svutt.getInfo()); // Viết thông tin ra file
                    writer.close(); // Đóng kết nối sau khi viết
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else
                System.err.println("Invalid, please enter again!!!");
        }
    }
}