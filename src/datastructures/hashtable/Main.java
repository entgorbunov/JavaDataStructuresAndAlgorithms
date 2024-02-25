package datastructures.hashtable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

    }
    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> integerBooleanHashMap = new HashMap<>();
        for (int i : array1) {
            integerBooleanHashMap.put(i, true);
        }
        for (int j : array2) {
            if(integerBooleanHashMap.get(j) != null) return true;
        }
        return false;
    }
}
