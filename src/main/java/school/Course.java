package school;

public class Course {
    private String name;
    private String instructor;
    private String room;

    public Course() {

    }

    public Course(String name, String instructor, String room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "school.Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
