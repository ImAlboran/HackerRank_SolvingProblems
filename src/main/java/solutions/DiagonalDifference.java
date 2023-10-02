package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int t = arr.size();
        int ltrd = 0; // left-to-right diagonal sum
        int rtld = 0; // right to left diagonal sum

        for (int i = 0; i < t; i++) {
            ltrd+=arr.get(i).get(i);
            rtld+=arr.get(i).get(t-1-i);
        }

        return Math.abs(ltrd - rtld); //absolut value of ltrd and rtld
    }
}
