package task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Program_04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input paragraph
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        scanner.close();

        // Convert to lowercase and split by non-word characters
        String[] words = paragraph.toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(words));

        // Arrays to hold unique words and their counts
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        // Count word occurrences manually
        for (String word : words)
        {
            if (word.isEmpty()) continue;

            int index = findIndex(uniqueWords, uniqueCount, word);
            if (index == -1)
            {
                uniqueWords[uniqueCount] = word; 
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
            else
            {
                counts[index]++;
            }
        }

        // Find the most repeated word
        int maxIndex = 0;
        for (int i = 1; i < uniqueCount; i++)
        {
            if (counts[i] > counts[maxIndex])
            {
                maxIndex = i;
            }
        }

        if (uniqueCount > 0)
        {
            System.out.println("Most repeated word: \"" + uniqueWords[maxIndex] + "\" occurred " + counts[maxIndex] + " times.");
        }
        else
        {
            System.out.println("No words found.");
        }
    }

    // Helper method to find the index of a word in the array
    private static int findIndex(String[] array, int length, String word) //uniqueWords, uniqueCount, word
    {
        for (int i = 0; i < length; i++)
        {
            if (array[i].equals(word)) //Java.equals(Java)
            {
                return i;
            }
        }
        return -1;
    }
}
