package Strings;

public class StringFunctions {
   public static void main(String[] args){
        String str = "Anshuman Singh";      // Spaces Also Count in Index
        System.out.println(str.indexOf("A"));

        String gtr = "Amit Singh";
        System.out.println(str.compareTo(gtr));

        System.out.println(str.charAt(3));

        System.out.println(str.length());

        System.out.println(str.contains("Ansh"));
        System.out.println(str.concat(gtr));
        System.out.println(str.endsWith("ngh"));

        System.out.println(gtr.startsWith("am"));
        System.out.println(str.toUpperCase());
        System.out.println(gtr.toLowerCase());
   } 
}
