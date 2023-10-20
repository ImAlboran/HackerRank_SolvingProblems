package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.size()-d; i++) {
            array.add(arr.get(d+i));
        }
        for (int i = 0; i < d; i++) {
            array.add(arr.get(i));
        }
        return array;
    }
}
