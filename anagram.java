import java.util.Arrays;
import java.io.*;
import java.lang.*;
public class anagram{
    public static void main(String[]args) {
        String firstString ="army";
        String secondString ="mary";
        System.out.print("the given char is anagram"+ isAnagram(firstString,secondString));
    }

        public static boolean isAnagram(String firstString,String SecondString)
        {
            char[]firstStringchararray= firstString.toLowerCase().toCharArray();
            char[]secondStringchararray=secondString.toLowerCase().toCharArray();
            Arrays.sort(firstStringchararray);
            Arrays.sort(secondStringchararray);

            return Arrays.equals(firstStringchararray,secondStringchararray);
        }
        
    }
    

