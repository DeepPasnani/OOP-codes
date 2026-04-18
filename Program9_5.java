import java.util.*;
 
public class Program9_5
{
    static <T extends Comparable<T>> void sortList(List<T> list)
    {
        Collections.sort(list);
    }
 
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(
            Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        System.out.println("Integer List before sorting: " + nums);
        sortList(nums);
        System.out.println("Integer List after sorting : " + nums);
        ArrayList<String> strs = new ArrayList<>(
            Arrays.asList("Banana", "Apple", "Cherry", "Date"));
        System.out.println("\nString List before sorting: " + strs);
        sortList(strs);
        System.out.println("String List after sorting : " + strs);
    }
}
