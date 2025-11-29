package com.student.controller;

import java.util.Scanner;

import com.student.service.StudentService;

public class StudentController {

	private static StudentService stdService = new StudentService();

	public static void main(String[] args) {
		try {
			while (true) {
				Scanner sc = new Scanner(System.in);

				System.out.println("=== Student Management System ===");
				System.out.println("1. Add Student");
				System.out.println("2. View Students");
				System.out.println("3. Update Student");
				System.out.println("4. Delete Student");
				System.out.println("5. Search Student");
				System.out.println("6. Exit");
				System.out.print("Enter choice: ");

				switch (sc.nextInt()) {
				case 1:
					stdService.addStudent();
					break;
				case 2:
					stdService.viewStudents();
					break;
				case 3:
					stdService.updateStudent();
					break;
				case 4:
					stdService.deleteStudent();
					break;
				case 5:
					stdService.searchStudent();
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Invalid choice!\n");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong!!! Please contact to application team.");
			e.printStackTrace();
		}
	}

}
