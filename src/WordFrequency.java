import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.*;


public class WordFrequency {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");

        // Creates an empty map (empty symbol table)
        Map<String, String> dnsTable = new TreeMap<>();
        // If I use a TreeMap underneath, keys come out in order
        // If I use a HashMap underneath, keys appear to be random

        Map<String, Integer> wordCounts = new TreeMap<>();

        Scanner infile = new Scanner(new File("tinyTale.txt"));
        Scanner infile2 = new Scanner(new File("tale.txt"));

        while (infile.hasNext()) {
            String word = infile.next();
            //

            // check to see if the word is in the map
            if (wordCounts.containsKey(word)){
                // get the existing value out
                int value = wordCounts.get(word);
                // increment the value
                value++;
                // update/put the updated value back in
                wordCounts.put(word, value);

            } else {
                // add the word to the map with a value of 1
                wordCounts.put(word, 1);
            }

            // put the word in the map
        } // end of while loop

        System.out.println(wordCounts);

        // write a loop to walk through items in the map
        for (String key: wordCounts.keySet()) {
            int value = wordCounts.get(key);
            System.out.println("The word " + key + " appears " + value +  " times.");

        }
    }
}
