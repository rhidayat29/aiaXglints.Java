package assessment1;

import java.util.Scanner;

import encodeDecode.Main;

public class User {

    private String username = null;
    private String password = null;
    private String firstname = null;
    private String lastname = null;
    private String email = null;
    private String fullName = null;

    Scanner myObj = new Scanner(System.in);
    Main toEncrypt = new Main();

    public User() {
       

    }

    // Define all setter and getter methods for each member field.
    public String getUsername() {
        return username;
    }

    public void setUsername() {
        // Create a Scanner object
        System.out.print("Enter username: ");
        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName + "\n"); // Output user inpu
        this.username = userName;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {

        System.out.print("Enter password: ");
        String pswd = myObj.nextLine(); // Read user input
        System.out.println("Password is : " + pswd + "\n"); // Output user inpu

        String ePass = pswd;
        Main.Encode(ePass);
        this.password = Main.Encode(ePass);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname() {
        System.out.print("Enter First Name: ");
        String fn = myObj.nextLine(); // Read user input
        System.out.println("First Name : " + fn + "\n"); // Output user inpu
        this.firstname = fn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname() {
        System.out.print("Enter Last Name: ");
        String ln = myObj.nextLine(); // Read user input
        System.out.println("Last name : " + ln + "\n"); // Output user inpu
        this.lastname = ln;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
        this.fullName = firstname + " " + lastname;
        System.out.println("full name : " + fullName + "\n");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.print("Enter email: ");
        String mail = myObj.nextLine(); // Read user input
        System.out.println("email is: " + mail + "\n"); // Output user inpu
        this.email = mail;
    }

    @Override
    public String toString() {
        User user1 = new User();
        user1.setUsername();
        user1.setEmail();
        user1.setFirstname();
        user1.setLastname();
        user1.setFullName();
        user1.setPassword();
        return "<\n Username: " + username + "\n Password: " + password + "\n email: " + email + "\n Full Name: "
                + fullName + "\n>";
    }
}