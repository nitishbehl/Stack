package stack;

import java.util.HashMap;

public class Frequency {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }
        System.out.println(map);
    }
}
