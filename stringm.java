public class stringm
{
    public static void main(String args[])
    {
        String str1="hello world";
        String str2=" Hello Iam Rehna from Pathanamthitta";

        int length=str1.length();
        System.out.println("Length of the string is:"+length);


        //String concatenation
        String str3=str1.concat(str2);
        System.out.println("Concatenated string is:"+str3);
        
        String str4=str1 + str2;
        System.out.println("Concatenated string is:"+str4);

        //String comparison checking equality
        String str5="REHNA";
        boolean isEqual=str1.equals(str5);
        System.out.println("Are the strings equal? "+isEqual);

        //String comparison with CompareTo
        int result=str1.compareTo(str5);
        System.out.println("Comparison result: "+result);

        //Index of a character
        int index=str1.indexOf('o');
        System.out.println("Index of 'o' in str1: "+index); 

        //uppercase and lowercase
        String upper=str1.toUpperCase();
        String lower=str1.toLowerCase();
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);

        //replace of a character
        String replaced=str1.replace('o', 'x');
        System.out.println("Replaced string: "+replaced);

        //compare to ignore case
        boolean isEqualIgnoreCase=str1.equalsIgnoreCase(str5);
        System.out.println("Are the strings equal ignoring case? "+isEqualIgnoreCase);

        //substring
        String substring=str1.substring(0,8);
        System.out.println("Substring of str1: "+substring);

        //trim
        String str6="   Hello World   ";
        String trimmed=str6.trim();
        System.out.println("Trimmed string: '"+trimmed+"'");

        //byte ascii value
        byte[] ascii = {68, 69, 70, };
        String str7 = new String(ascii);
        System.out.println("String from ASCII values: " + str7);


        byte[] bytearray = str1.getBytes();
        System.out.println("ASCII values of str1:" +java.util.Arrays.toString(bytearray));

       

    }
}