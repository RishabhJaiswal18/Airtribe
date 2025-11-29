# Java Student Management System

## 📌 Project Overview
This project is a **console-based Student Management System** developed as part of the **Java Fundamentals Assignment**.  
It demonstrates core Java concepts such as **OOP principles, constructors, inheritance, polymorphism, interfaces, collections, and JVM internals**.

---

## 🎯 Features Implemented

### ✅ Core Functionalities
- Add new students
- View all students
- Update student details
- Delete a student record
- Search students by **ID** or **Name**
- Maintain dynamic data using **ArrayList**
- Menu-driven console interface

### 🏛 Entity Classes
- **Student**
- **Course**
- **Enrollment**

---

## 🧠 OOP Concepts Used

| Concept | Where Used |
|--------|------------|
| Encapsulation | Private fields with getters/setters |
| Inheritance | Student inherits Person, GraduateStudent extends Student |
| Polymorphism | Method overriding with dynamic dispatch |
| Abstraction | Interfaces for multiple implementations |
| Constructor Overloading | Student constructors |
| Constructor Chaining | Use of `this()` and `super()` |

---

## 🏗 JVM Architecture Report
This project includes documentation explaining:

- Class Loader subsystem
- Runtime Data Areas
- Execution Engine (Interpreter & JIT)
- How Java achieves **"Write Once, Run Anywhere"**

---

## 🖥️ How to Run the Application

### 🔧 Prerequisites
Spring Tool Suite (STS) installed

JDK 8+ configured

Project imported into STS

▶️ Run Steps (STS IDE)

1️⃣ Open STS
2️⃣ Click File → Import → Existing Maven / Java Project
3️⃣ Browse and select the project folder
4️⃣ Wait for STS to build the project
5️⃣ Go to the Main class containing the public static void main(String[] args) method
6️⃣ Right-click → Run As → Java Application

✔ The console will show the menu like:
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Search Student
6. Exit
