// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Case changer

public class Changer {
    public static void main(String []args){
        char c = 0;
        String str = "Mary has a little dog.she calls him Pun";
        System.out.println("String in lower case: "+str);
        int len = str.length();
        StringBuffer strBuffer = new StringBuffer(len);
        for (int i =0; i<len ; i++) {
            c = str.charAt(i);
            if (Character.isTitleCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            strBuffer.append(c);
        }
        System.out.println("Converting case: "+strBuffer.toString());
    }
}