import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Solution {
    public Solution(File a, int size_of_file) {
        try (Scanner sc = new Scanner(a)) {
            int[] nums = new int[size_of_file];

            int i=0;
            while(sc.hasNextInt()){
                nums[i]=sc.nextInt();
                i++;
            }

            FileWriter fw=new FileWriter(a);
            HeapSort.sort(nums);

            for (i=0;i<size_of_file;i++)
                fw.append(Integer.toString(nums[i])+"\n");
            fw.flush();
        }
        catch (IOException x){
            System.out.println(x.getMessage());
        }
    }
}
