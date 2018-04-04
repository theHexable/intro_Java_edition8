package Chapter10.Exercises;

import java.util.Arrays;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.9
 * @Title The Course class
 */
public class Exercise10_09 {

    public static void main(String[] args) {
        Course course = new Course("Programming");
        course.addStudent("Saeed Mohammad");
        course.addStudent("Mohammad Farag");
        course.addStudent("Ammar Karamah");
        course.dropStudent("Mohammad Farag");
        for (int i = 0; i < course.getStudents().length; i++) {
            if (course.getStudents()[i] == null) {
                break;
            }
            System.out.println(course.getStudents()[i]);
        }
    }
}

class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] students1 = new String[numberOfStudents + 10];
            System.arraycopy(this.students, 0, students1, 0, this.students.length);
            this.students = students1;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = Arrays.binarySearch(students, 0, numberOfStudents, student);
        for (int i = index; i < numberOfStudents; i++) {
            this.students[i] = this.students[i + 1];
        }
        this.students[numberOfStudents] = null;
        this.numberOfStudents--;
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            this.students[i] = null;
        }
        this.numberOfStudents = 0;
    }
}
