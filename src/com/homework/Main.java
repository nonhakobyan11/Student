package com.homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Input your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Input your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.print("Input what year are you studying? ");
        int yearOfStudy = scanner.nextInt();

        Student student = new Student(firstName, lastName,  yearOfStudy, gpa );
        student.hasScholarship();
        student.goToUni();
        student.studyForExam();



    }
}
