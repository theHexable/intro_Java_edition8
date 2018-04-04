package Chapter11.Exercises;

import java.util.ArrayList;

/**
 *
 * @author Shady Bajary
 * @Exercise 11.5
 * @Title The Course class
 */
public class Exercise11_05 {

    public static void main(String[] args) {

    }
}

class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        return (String[]) students.toArray();
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }
}
