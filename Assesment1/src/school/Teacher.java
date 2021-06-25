package school;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Teacher extends Person {
    int numCourse = 0;
    private String[] courses = { "math", "sains" };
    boolean canAdd;
    boolean canRemove;
    Set<String> listCourse = new HashSet<String>(Arrays.asList(courses));
    Scanner myObj = new Scanner(System.in);

    public Teacher() {
        super();
        System.out.println("\n====== Welcome Teacher ======\n");

        // TODO Auto-generated constructor stub
    }

    public String toString() {

        return "Teacher: " + nameIs + " (" + addressIs + ") ";

    }

    public boolean addCourse() {
        // Set<String> newCourse = new HashSet<String>(Arrays.asList(courses));
        System.out.print("Enter New Course: ");
        String inputCourse = myObj.nextLine(); // Read user input
        System.out.println("New COurse is: " + inputCourse + "\n"); // Output user inpu

        System.out.println("Initial All Course: " + listCourse);
        if (listCourse.contains(inputCourse)) {
            System.out.println("Input Failed, Course Available");
            this.canAdd = false;
            

        } else {
            listCourse.add(inputCourse);
            this.courses = listCourse.toArray(courses);

            System.out.println("\nAdd Course Succes: " + inputCourse);
            System.out.println("All Course: " + listCourse);
            this.canAdd = true;

        }

        // System.out.println(isAvailable);
        return canAdd;
    }

    public boolean removeCourse() {
        // Set<String> newCourse = new HashSet<String>(Arrays.asList(courses));
        System.out.print("Delete Course: ");
        String delCourse = myObj.nextLine(); // Read user input
        System.out.println("You want to Delete " + delCourse + "Course\n"); // Output user inpu

        System.out.println("\nInitial All Course: " + listCourse);
        if (listCourse.contains(delCourse)) {
            listCourse.remove(delCourse);
            this.courses = listCourse.toArray(courses);
            System.out.println("Deleted Succes");
            System.out.println("All Course: " + listCourse);

            this.canRemove = true;

        } else {
            System.out.println("\nDeleted Failed, Course Unavailable");
            System.out.println("All Course: " + listCourse);
            this.canRemove = false;

        }

        // System.out.println(isAvailable);
        return canRemove;
    }

}
