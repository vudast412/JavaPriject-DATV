import java.util.Scanner;

public class Student {
    private String studentcode, name, birth, gender;
    private float math, english, history;

    public Student() {}

    public Student(String codestudent, String name, String birth, String gender, float math, float english, float history) {
        this.studentcode = codestudent;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.math = math;
        this.english = english;
        this.history = history;
    }

    public void input(Scanner scanner) {
        System.out.println("Enter your student code: ");
        studentcode = scanner.nextLine();
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your birth: ");
        birth = scanner.nextLine();
        System.out.println("Enter your gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter your mark math: ");
        math = scanner.nextFloat();
        System.out.println("Enter your mark english: ");
        english = scanner.nextFloat();
        System.out.println("Enter your mark history: ");
        history = scanner.nextFloat();
    }

    public String getPersonalInfo() {
        return "Student code: " + studentcode + "\nName: " + name + "\nBirth: " + birth + "\nGender: " + gender;
    }

    public float MarkGPA() {
        return (math + english + history) / 3;
    }
}