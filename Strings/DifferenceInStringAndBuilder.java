package Strings;

public class DifferenceInStringAndBuilder {
    public static void main(String[] args){
        String str = "Hello";
        str.concat("World");   // ye original string me change nhi krega new string banata hai usme add krta hai

        StringBuilder gtr = new StringBuilder("Hii");
        gtr.append("Anshuman");   //ye original string me change(modify) krega new strign nhi banata
    }
}
