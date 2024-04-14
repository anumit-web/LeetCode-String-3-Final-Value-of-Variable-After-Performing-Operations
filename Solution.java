/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int finalValueAfterOperations(String[] operations) {

        int res = 0;

        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];

            if (str.equals("++X") || str.equals("X++")) {
                res++;
            } else {
                res--;
            }

        }

        return res;

    }

}
