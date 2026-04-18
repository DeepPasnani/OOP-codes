import java.util.*;
 
public class Program9_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : freq.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
