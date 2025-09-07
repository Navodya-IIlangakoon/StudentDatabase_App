package com.studentapp.main;

import java.util.*;
import com.studentapp.dao.*;
import com.studentapp.model.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        Student newStudent = new Student(name, email, age);
                        dao.addStudent(newStudent);
                        System.out.println("✅ Student added successfully!");
                        break;

                    case 2:
                        List<Student> students = dao.getAllStudents();
                        for (Student s : students) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        System.out.print("Enter student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        Student updatedStudent = new Student(updateId, newName, newEmail, newAge);
                        dao.updateStudent(updatedStudent);
                        System.out.println("✅ Student updated successfully!");
                        break;

                    case 4:
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = scanner.nextInt();
                        dao.deleteStudent(deleteId);
                        System.out.println("🗑️ Student deleted successfully!");
                        break;

                    case 5:
                        System.out.println("👋 Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("⚠️ Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}
