package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
    public void getStudentTest_whenGivenId_thenReturnStudentWithId() {
        //GIVEN
        Student student = new Student("Eva","Goetzke",12345);
        School school = new School();
        school.addStudent(student);

        //WHEN
        Student actual = school.getStudent(student.getId());

        //THEN
        assertEquals(student, actual);
    }

    @Test
    public void addStudentTest_whenAddingStudent_thenStudentListContainsStudent() {
        //GIVEN
        Student student = new Student("Eva","Goetzke",12345);
        School school = new School();

        //WHEN
        school.addStudent(student);

        //THEN
        assertTrue(school.getStudents().contains(student));
    }

}