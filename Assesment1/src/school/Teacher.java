package school;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {
    int numCourse = 0;
    private String[] courses = { "math", "sains" };
    boolean canAdd;
    boolean canRemove;
    Set<String> newCourse = new HashSet<String>(Arrays.asList(courses));

    public Teacher(String name, String address) {
        super(name, address);
        System.out.println("\n====== Welcome Teacher ======\n");
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Teacher: " + nameIs + " (" + addressIs + ")";
    }

    public boolean addCourse(String inputCourse) {
        // Set<String> newCourse = new HashSet<String>(Arrays.asList(courses));
        System.out.println("Initial All Course: " + newCourse);
        if (newCourse.contains(inputCourse)) {
            System.out.println("Input Failed, Course Available");
            this.canAdd = false;

        } else {
            newCourse.add(inputCourse);
            this.courses = newCourse.toArray(courses);

            System.out.println("\nAdd Course Succes: " + inputCourse);
            System.out.println("All Course: " + newCourse);
            this.canAdd = true;

        }

        // System.out.println(isAvailable);
        return canAdd;
    }

    public boolean removeCourse(String delCourse) {
        // Set<String> newCourse = new HashSet<String>(Arrays.asList(courses));
        System.out.println("\nInitial All Course: " + newCourse);
        if (newCourse.contains(delCourse)) {
            newCourse.remove(delCourse);
            this.courses = newCourse.toArray(courses);
            System.out.println("Deleted Succes");
            System.out.println("All Course: " + newCourse);

            this.canRemove = true;

        } else {
            System.out.println("\nDeleted Failed, Course Unavailable");
            System.out.println("All Course: " + newCourse);
            this.canRemove = false;

        }

        // System.out.println(isAvailable);
        return canRemove;
    }

}
