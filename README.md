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

📁 File: `/docs/JVM_Architecture_Report.pdf` *(you will place your report here)*

---

## 🖥️ How to Run the Application

### 🔧 Prerequisites
- JDK 8 or higher installed
- Java compiler configured in PATH

### ▶️ Run Steps

```bash
javac Main.java
java Main
