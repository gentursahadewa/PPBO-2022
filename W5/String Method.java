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
        for(int i = 0; i < string.length(); i = i + 3) {
            System.out.print(string.charAt(i));
        }
        input.close();
    }
}
