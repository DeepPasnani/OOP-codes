import java.io.*;
import java.nio.file.*;
import java.util.Date;
 
public class Program8_2
{
    static void printProperties(File f)
    {
        System.out.println("File Name     : " + f.getName());
        System.out.println("Absolute Path : " + f.getAbsolutePath());
        System.out.println("File Size     : " + f.length() + " bytes");
        System.out.println("Readable      : " + f.canRead());
        System.out.println("Writable      : " + f.canWrite());
        System.out.println("Last Modified : " + new Date(f.lastModified()));
    }
 
    public static void main(String[] args) throws IOException
    {
        if (args.length < 2)
        { System.out.println("Usage: java Program8_2 <cmd> <args>"); return; }
        String cmd = args[0];
        if (cmd.equals("copy") && args.length == 3)
        {
            Files.copy(Paths.get(args[1]), Paths.get(args[2]),
                       StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
            printProperties(new File(args[2]));
        }
        else if (cmd.equals("delete"))
        {
            if (new File(args[1]).delete())
                System.out.println("File deleted successfully.");
            else System.out.println("Delete failed.");
        }
        else if (cmd.equals("rename") && args.length == 3)
        {
            File src = new File(args[1]), dst = new File(args[2]);
            if (src.renameTo(dst)) System.out.println("File renamed successfully.");
            else System.out.println("Rename failed.");
        }
        else System.out.println("Unknown command.");
    }
}
