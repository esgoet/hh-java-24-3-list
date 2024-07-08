package school.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eva", "Goetzke", 12345);
        Student student2 = new Student("Rinae", "Hyun", 23456);
        Student student3 = new Student("Simon", "Staß", 34567);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        School school = new School(students);
        System.out.println(school);

        // add a course
        System.out.println(school.getStudentCourseList(12345));
        Course javaCourse = new Course("Java", "Florian", "24-3");
        school.getStudent(12345).addCourse(javaCourse);
        System.out.println(school.getStudentCourseList(12345));

        System.out.println(school.getStudent(12345));
        school.removeStudent(student2);
        school.removeStudent(12345);
        System.out.println(school);
    }
}
