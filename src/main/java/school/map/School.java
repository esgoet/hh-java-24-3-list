package school.map;

import java.util.HashMap;
import java.util.Map;

public class School {
    Map<Integer, Student> students = new HashMap<>();;

    public School() {
    }

    public void addStudent(int id, Student student) {
        students.put(id, student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
