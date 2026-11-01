import java.util.Scanner;
public class Main {
    // main method
    public static void main(String[] args) {
        //scanner object
        Scanner input=new Scanner(System.in);
        //enter the string
        System.out.println("Enter your String:");
        String original=input.nextLine();
        System.out.println("Original String:"+original);
        //string operation
        String reverse=new StringBuilder(original).reverse().toString();
        //display the reversed string
        System.out.println("Reversed string:"+reverse);
        //string length
        System.out.println("String Length:"+original.length());
        //convert to upper and lower case
        System.out.println("UpperCase:"+original.toUpperCase());
        System.out.println("LowerCase:"+original.toLowerCase());
        //merge 2 strings
        System.out.println("Enter another string:");
        String new_orig=input.nextLine();
        String merged=original+new_orig;
        System.out.println("Merged string:"+merged);
        //compare strings
        System.out.println("Is String 1 the same as String 2?"+original.equals(new_orig));
        //find a character in a string
        System.out.println("Enter the character to find the word:"+new_orig);
        String chr=input.nextLine();
        int n=new_orig.indexOf(chr);
        System.out.println(chr+" is found in position "+n+" in the word "+new_orig);
        //close the scanner object
        input.close();
    }
}