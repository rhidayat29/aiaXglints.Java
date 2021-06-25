package assessment1;


import java.util.Scanner;

import school.Student;
import school.Teacher;

public class Register {
    
    static Scanner myObj = new Scanner(System.in); 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("=========== MONTHLY REPORT ===========");

        /*
         * Person person1 = new Person("aceng", "lahat"); 
         * error cus Person is an abstarct class, 
         * it can only be call by Person child class, 
         * in this is Student class and Teacher class;
         */
        
            System.out.print("Choose Info as: \n1. Teacher \n2. Student \n= ");
            int choose = myObj.nextInt(); 
            if(choose == 1) {
                Teacher teacher = new Teacher();
                System.out.println(teacher.toString());
                teacher.addCourse();
                teacher.addCourse();
                teacher.removeCourse();
                teacher.removeCourse();
            }
            else if(choose == 2) {
                Student student = new Student();

                System.out.println(student.toString());
                student.addCourseGrade("Math", 8);
                student.addCourseGrade("English", 9);
                student.addCourseGrade("History", 9);
                student.printGrades();
                System.out.println("Average Grade : " + student.getAverageGrade());
            }
            else {
                System.out.println("Wrong input!!");
            }
//
//         User user1 = new User();
//          
//		System.out.println("User: " + user1.toString() + "\n");
//
//		System.out.println("\nMy username is: " + user1.getUsername());
//
//		System.out.println("My password is: " + user1.getPassword());
//		System.out.println("I am about to change my password...\n");
//
//		user1.setPassword();
//		System.out.println("My new password is: " + user1.getPassword());
//
//		System.out.println("\n User: " + user1.toString() + "\n");

    }

}
