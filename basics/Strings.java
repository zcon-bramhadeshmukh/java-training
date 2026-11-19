public class Strings {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        //concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        //string methods
        //length of the string
        System.out.println("Length of str1: " + str1.length());

        //accessing characters in the string
        System.out.println("First character of str1: " + str1.charAt(0));

        //substring
        String substring = concatenated.substring(0, 5);
        System.out.println("Substring: " + substring);

        //string comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        //uppercase
        String upperCase = str1.toUpperCase();
        System.out.println("Uppercase str1: " + upperCase);

        //lowercase
        String lowerCase = str2.toLowerCase();
        System.out.println("Lowercase str2: " + lowerCase);

        //string trimming
        String str = "   Java   ";
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");

        //string replacement
        String replaced = concatenated.replace("World", "Java");
        System.out.println("Replaced String: " + replaced);

        //string buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("String Buffer: " + sb.toString());
        //string buffer methods
        sb.insert(5, " Java");
        System.out.println("String Buffer after insert: " + sb.toString());
        sb.delete(5, 10);
        System.out.println("String Buffer after delete: " + sb.toString());
        sb.reverse();
        System.out.println("String Buffer after reverse: " + sb.toString());
        //string buffer is mutable, so we can change its content without creating a new object
        //but string literals are immutable, so any change creates a new object
        //copying of string literals is done using the string pool, so if we create a new 
        //string with the same content, it will point to the same object in the string pool
        //string pool is a special memory area where string literals are stored,
        //but stringbuffer and stringbuilder are stored in the heap memory, so they are not 
        //getting same object reference when we create a new stringbuffer or stringbuilder with the same content

        //string builder
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println("String Builder: " + sbuilder.toString());
        //string builder methods
        sbuilder.insert(5, " Java");
        System.out.println("String Builder after insert: " + sbuilder.toString());
        sbuilder.delete(5, 10);
        System.out.println("String Builder after delete: " + sbuilder.toString());
        sbuilder.reverse();
        System.out.println("String Builder after reverse: " + sbuilder.toString());

        //string builder is also mutable, so we can change its content without creating a new object
        //basic difference between stringbuffer and stringbuilder is that stringbuffer is synchronized, 
        //so it is thread-safe, but stringbuilder is not synchronized, so it is not thread-safe, 
        //stringbuilder is faster than stringbuffer because of this reason
    }
}

/*
output:
Concatenated String: Hello World
Length of str1: 5
First character of str1: H
Substring: Hello
Are str1 and str2 equal? false
Uppercase str1: HELLO
Lowercase str2: world
Trimmed String: 'Java'
Replaced String: Hello Java
String Buffer: Hello World
String Buffer after insert: Hello Java World
String Buffer after delete: Hello World
String Buffer after reverse: dlroW olleH
String Builder: Hello World
String Builder after insert: Hello Java World
String Builder after delete: Hello World
String Builder after reverse: dlroW olleH
*/