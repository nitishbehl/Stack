package string;

import java.util.TreeMap;

public class increasingDecreasing {
    public static String sortString(String s) {
        TreeMap<Character, Integer> map = new TreeMap();
        for (int i = 0; i < s.toCharArray().length; i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), ++count);
        }
        StringBuilder stringBuilder=new StringBuilder();

        boolean notOne=true;
        while (notOne){
            for (Character character : map.keySet()) {
                stringBuilder.append(character);
                int value = map.get(character);
                map.put(character, value--);
            }
            for (Character character : map.keySet()) {
                stringBuilder.append(character);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        sortString("aaaabbbbcccc");

    }

}
