# Java Swing Practicals

Welcome to **Java Swing Practicals** – a repository designed to help developers write clean code, learn, debug, test, and deploy Java Swing applications. This project is focused on hands-on practice and is ideal for students taking advanced Java courses.

## About Me
Hi, I'm **Abdirahman Tusbahle**, a software developer and lecturer. I am passionate about teaching and helping young developers master Java Swing through practical coding exercises. This repository will guide you in writing pure Java Swing applications without using drag-and-drop editors.

## Prerequisites
Before starting, ensure you have a solid understanding of the following Java core concepts:
- Variables and Data Types
- Loops (for, while, do-while)
- Conditional Statements (if-else, switch-case)
- Functions and Methods
- Basic Object-Oriented Programming (OOP) concepts (Classes, Objects, Inheritance, Polymorphism, Encapsulation, Abstraction)

## Installation Requirements
To work with Java Swing, you need:
1. **JDK (Java Development Kit)** – Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.
2. **JRE (Java Runtime Environment)** – Included in most JDK installations.
3. **Text Editor or IDE** – You can use any text editor (VS Code, Notepad++) or an IDE (IntelliJ IDEA, Eclipse, NetBeans).
4. **Command Line (CMD/Terminal)** – To compile and run Java files manually.

## Running a Java File from CMD
1. Open a terminal or command prompt.
2. Navigate to your Java file’s directory.
3. Compile the Java file:
   ```sh
   javac MyProgram.java
   ```
4. Run the compiled class:
   ```sh
   java MyProgram
   ```

## Writing Your First Java Swing Program
Here’s a simple Java Swing program that creates a basic window:

```java
import javax.swing.*;

public class FirstSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        JButton button = new JButton("Click Me");
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        button.setBounds(150, 100, 100, 50);
        frame.add(button);
        
        frame.setVisible(true);
    }
}
```

### Explanation:
- `JFrame` is the main window.
- `JButton` creates a clickable button.
- `setSize()` defines the window dimensions.
- `setLayout(null)` allows manual positioning of components.
- `setVisible(true)` makes the window appear.

## Contribution & Learning
- Explore different Java Swing components (JLabel, JTextField, JPanel, etc.).
- Practice event handling and layouts.
- Debug and optimize your code for better performance.
- Feel free to contribute to this repository and share your improvements!

---
Happy Coding! 🚀
