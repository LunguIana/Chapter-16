package Ex_14;

import java.util.*;

public class CountingLetters {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        char[] tokens = input.toCharArray();

        for (char token: tokens) {

            if(map.containsKey(String.valueOf(token))){
                int count = map.get(String.valueOf(token));
                map.put(String.valueOf(token), count+1);
            }else{
                map.put(String.valueOf(token), 1);
            }
        }
    }

    private static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}