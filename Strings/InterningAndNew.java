package Strings;

public class InterningAndNew {
    public static void main(String[] args){
        String str = "Hello";
        String gtr = "Hello";   // Here both str and gtr point the same content(hello) in heap memory and this process knowns as interning and it save memory.
        
        String x = new String("Hello");   // interning problem is solve by using new keywords
    
    }
}
