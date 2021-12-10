package Ex_16;

import java.util.Scanner;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;

        System.out.println("Enter the sentence and pres Enter");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();

        String[] tokens = sentence.split(" ");

        System.out.println("Duplicate words in this sentence is --> ");

        for (int i = 0; i < tokens.length; i++){
            count = 1;
            for (int j = i+1; j < tokens.length; j++){
                if(tokens[i].equals(tokens[j])){
                    count++;
                    tokens[j] = "0";
                }
            }
            if(count > 1 && tokens[i] != "0"){
                System.out.println(tokens[i]+" --> "+count);
            }
        }
    }
}