//import java.io.*;
import java.util.Scanner;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        String string;

        Scanner input = new Scanner(System.in);
        string = input.nextLine();
        int code;
        if (string.matches("[AaIiUuEeOo].*")) {
            code = 1;
        } 
        else if (string.matches("(.*[^ng])(ng)")) {
            code = 2;
        }
        else {code = -1;}

        System.out.print(code);
        input.close();
    }
}
