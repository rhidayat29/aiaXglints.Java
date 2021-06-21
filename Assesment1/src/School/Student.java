package School;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {
    int numCourses = 0;
    private String[] courses = {};
    private Integer[] grades = {};
    double averageGrade = 0;
    ArrayList<Integer> inputGrade = new ArrayList<Integer>(Arrays.asList(grades));
    ArrayList<String> inputCourse = new ArrayList<String>(Arrays.asList(courses));

    public Student(String name, String address) {
        super(name, address);
        System.out.println("\n====== Welcome Student ======\n");

        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Student: " + nameIs + " (" + addressIs + ") ";
    }

    public void addCourseGrade(String course, int grade) {

        inputGrade.add(grade);

        this.grades = inputGrade.toArray(grades);

      
        inputCourse.add(course);

        this.courses = inputCourse.toArray(courses);

        System.out.println("Course: " + course + "  Grade: " + grade);

    }

    public void printGrades() {
        System.out.println("All Grades: " + Arrays.asList(grades));
        for (int i = 0; i < grades.length; i++) {
            System.out.println(courses[i] + " " + grades[i]);
        }

    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

        this.averageGrade = sum / grades.length;
        return averageGrade;
    }

//	public void hello(String nameIs) {
//		super.hello(nameIs);
//		System.out.println("Hi Student " + nameIs);
//		// TODO Auto-generated constructor stub
//	}

}
