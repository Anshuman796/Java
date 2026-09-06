package Strings;

public class ImmutabilityOfString {
    public static void main(String[] args){
        String str = "Anshuman Singh";

        // str.charAt(0)="d"   --> not possible because string is immutable

        str = "Java";        // --> it does not change the string Anshuman Singh it only point to Java
    }
}
