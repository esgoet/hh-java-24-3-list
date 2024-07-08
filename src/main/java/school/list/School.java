package school.list;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students;
    public School() {
        students = new ArrayList<>();
    }

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Course> getStudentCourseList(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student.getCourseList();
            }
        }
        return null;
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public boolean removeStudent(int id) {
        return students.removeIf(student -> student.getId() == id);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "school.list.School{" +
                "students=" + students +
                '}';
    }
}
