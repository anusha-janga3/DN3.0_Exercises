// com/example/main/MVCPatternExample.java
package com.example.test;

import com.example.model.Student;
import com.example.view.StudentView;
import com.example.controller.StudentController;

public class MVCPatternExample {
    public static void main(String[] args) {
        // Fetch student record from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to update the model and control the view
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("John Smith");
        controller.setStudentGrade("A");

        // Display updated student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        // Simulate fetching student record from the database
        return new Student("1", "Jane Doe", "B");
    }
}
