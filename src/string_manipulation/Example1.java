package string_manipulation;

public class Example1 {
    public static void main(String[] args){
        String s1 ="Begin your day today with smile";
        System.out.println("Length: " + s1.length());

        String s2 = "green";
        String s3 = "tea";
        System.out.println("Concatenation1: " + s2.concat(s3));
        System.out.println("Concatenation2: " + s2+s3);

        String s4 = "concatenation";
        System.out.println("Char At: " + s4.charAt(4));
        System.out.println("Index At: " + s4.indexOf('a'));
        System.out.println("Index At: " + s4.lastIndexOf('a'));

        System.out.println("Uppercase: " + s4.toUpperCase());
        String s5 = "LOWERCASE";
        System.out.println("Lowercase: " + s5.toLowerCase());

        System.out.println(s4.substring(4));
        System.out.println(s4.replace('a', 'z'));

        String s6 = "hop ";
        System.out.println(s6.trim());

        String s7 ="Hello";
        String s8 ="hello";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
    }
}
