import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ManagementSystem {
    private ArrayList<Student> students;
    private int currentId;

    public ManagementSystem() {
        students = new ArrayList<>();
        currentId = 1;
    }

    public void addStudent(String name, String mail) {
        Student newStudent = new Student(currentId++, name, mail);
        students.add(newStudent);
        System.out.println("Student added: " + newStudent.toString());
    }

    public void listStudents() {
        if (students.isEmpty()){
            System.out.println("There is no students in the system.");
        }else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void updateStudent(int id, String name, String mail) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setMail(mail);
                System.out.println("Student updated: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (Student student : students){
            if (student.getId() == id){
                students.remove(student);
                System.out.println("Student deleted: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
