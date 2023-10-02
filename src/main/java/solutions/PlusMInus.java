package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PlusMInus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float numP=0;
        float numN=0;
        float numZ=0;
        int t=arr.size();

        for(int i=0;i<t;i++){
            if(arr.get(i)<0){
                numN++;
            }else if(arr.get(i)>0){
                numP++;
            }else{
                numZ++;
            }
        }

        System.out.println(numP/t);
        System.out.println(numN/t);
        System.out.println(numZ/t);
    }
}
