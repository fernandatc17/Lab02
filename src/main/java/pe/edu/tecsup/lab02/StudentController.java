package pe.edu.tecsup.lab02;

import java.util.ArrayList;
import java.util.List;

public class StudentController {


    public StudentController() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }


}