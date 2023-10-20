package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int nbr_tallest = 0;
        int tallest = candles.get(0);
        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i) > tallest) {
                tallest = candles.get(i);
            }
        }
        for (Integer candle : candles) {
            if (candle == tallest) {
                nbr_tallest++;
            }
        }

        return nbr_tallest;
    }
}
