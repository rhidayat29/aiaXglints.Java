package reverse;

import java.util.Scanner;

public class ReverseString {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Input String = ");
        String inputString = scanner.nextLine();
        System.out.println("Original String :" + inputString);

        String reverseString = "";

        for (int i = inputString.length() - 1; i >= 0; --i) {
            //System.out.println(i);
            reverseString += inputString.charAt(i);
            //System.out.println(reverseString);
        }

        System.out.println("Reverse String : "+ reverseString);

    }

}
