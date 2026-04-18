import java.io.*;
 
public class Program8_1
{
    public static void main(String[] args) throws IOException
    {
        if (args.length < 1)
        {
            System.out.println("Usage: java Program8_1 <filename>");
            return;
        }
        long chars = 0, words = 0, lines = 0;
        boolean inWord = false;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
        {
            int c;
            while ((c = br.read()) != -1)
            {
                chars++;
                if (c == '\n') lines++;
                if (Character.isWhitespace(c)) inWord = false;
                else if (!inWord) { inWord = true; words++; }
            }
        }
        System.out.println("File: " + args[0]);
        System.out.println("Number of characters : " + chars);
        System.out.println("Number of words      : " + words);
        System.out.println("Number of lines      : " + lines);
    }
}
