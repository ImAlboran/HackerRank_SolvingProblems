package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Staircase {

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
