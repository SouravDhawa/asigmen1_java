package fast_exam;

public class qustion1 {
    /*the string is immutable in java becouse  of the security & synchronise
     and class loading .the reson of making string final is to destroy to immutibility
     and not allow others to extend it.

     the difference between string and string builder is  a string is immutable in java but
     a string builder  is mutable in java
    for example:

     */
    public static void main(String[] args) {
        String name ="sourav";
        int length=name.length();
        System.out.println(length);

        int index=name.indexOf("u");
        System.out.println(index);

        String full_name=name.concat("dhawa");
        System.out.println(full_name);

        char ch=name.charAt(0);
        System.out.println(ch);

        String sb=name.substring(2);
        System.out.println(sb);
    }
}
