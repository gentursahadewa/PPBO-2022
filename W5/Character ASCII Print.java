//import java.io.*;
import java.util.Scanner;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        char char1, char2, tempChar;
        Scanner input = new Scanner(System.in);
        char1 = input.next().charAt(0);
        char2 = input.next().charAt(0);
        input.close();

        if(char1 > char2) {
            tempChar = char2;
            char2 = char1;
            char1 = tempChar;
        }
        StringBuilder strBuild = new StringBuilder();
        for(; char1 <= char2; char1++){
            strBuild.append(char1);
        }
        System.out.print(strBuild);
    }
}
