package com.java.programs;

public class ReverseString {


    public static String reverseString(String value)
    {

        //Converting string to Char Array with the predefined method
         char[] name = value.toCharArray();

//        StringBuilder original = new StringBuilder();
         StringBuilder reverse = new StringBuilder();

        /* To Print in the original order
        for (char c : name) {
            System.out.println("Original:" + c);
            original.append(c);
        }*/
        int i;
        for( i = name.length-1;i >=0 ; i--)
        {
            //System.out.println(name[i]);
            reverse.append(name[i]);
        }


        return reverse.toString();
    }


    public static void main(String[] args) {
        String value = "SHIVAPRASADRAO";
        System.out.println("Original:"+value);
        String reversedString = reverseString(value);
        System.out.println("Reversed:"+reversedString);

    }
}
