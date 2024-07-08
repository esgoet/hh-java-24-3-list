package school.map;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eva", "Goetzke", 12345);
        Student student2 = new Student("Rinae", "Hyun", 23456);
        Student student3 = new Student("Simon", "Staß", 34567);

        School school = new School();
        school.addStudent(student1.getId(), student1);
        System.out.println(school);
        System.out.println(school.getStudent(student1.getId()));
        school.removeStudent(student1.getId());
        System.out.println(school);


    }

}
