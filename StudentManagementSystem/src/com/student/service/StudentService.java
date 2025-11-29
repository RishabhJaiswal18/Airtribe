package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.student.model.Student;

public class StudentService {

	private List<Student> student = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public void addStudent() {
		System.out.println("Enter Student Id: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Student Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Student Course: ");
		String course = scan.nextLine();

		student.add(new Student(id, name, course));
		System.out.println("Student Added Successfully!\\n");
	}

	public void viewStudents() {
		if (student.isEmpty()) {
			System.out.println("No students available.\n");
			return;
		}

		for (Student s : student)
			System.out.println(s);
		System.out.println();

	}

	public void updateStudent() {
		System.out.print("Enter Student ID to update: ");
		int id = scan.nextInt();
		scan.nextLine();

		for (Student s : student) {
			if (s.getId() == id) {
				System.out.print("Enter New Name: ");
				s.setName(scan.nextLine());
				System.out.print("Enter New Course: ");
				s.setCourse(scan.nextLine());
				System.out.println("Student Updated Successfully!\n");
				return;
			}
		}
		System.out.println("Student not found!\n");

	}

	public void deleteStudent() {
		System.out.print("Enter Student ID to delete: ");
		int id = scan.nextInt();
		scan.nextLine();

		student.removeIf(s -> s.getId() == id);
		System.out.println("If existed, Student deleted!\n");

	}

	public void searchStudent() {
		System.out.println("Search By: 1-ID  2-Name");
		int choice = scan.nextInt();
		scan.nextLine();

		if (choice == 1) {
			System.out.print("Enter ID: ");
			int id = scan.nextInt();
			student.stream().filter(s -> s.getId() == id).forEach(System.out::println);
		} else {
			System.out.print("Enter Name: ");
			String name = scan.nextLine();
			student.stream().filter(s -> s.getName().equalsIgnoreCase(name)).forEach(System.out::println);
		}
		System.out.println();

	}

}
