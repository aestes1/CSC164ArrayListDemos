package p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Integer [] integerArray = {5, 7, 8, 0};

        //"Integer" is a wrapper class
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
    }
}
