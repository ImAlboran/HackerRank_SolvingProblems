package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        int taille = queries.size();
        List<Integer> instance = new ArrayList<>(taille);
        for (int i = 0; i < taille; i++) {
            instance.add(0);
        }

        for (int i = 0; i < taille; i++) {
            for (String mot : stringList) {
                if (queries.get(i).equals(mot)) {
                    instance.set(i, instance.get(i)+1);
                }
            }
        }
        return instance;

    }
}
