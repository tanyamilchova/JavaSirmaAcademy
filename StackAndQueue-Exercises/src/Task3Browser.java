import java.util.ArrayDeque;

public class Task3Browser {
    //Write a program that takes two types of browser instructions:
    // Normal navigation: a URL is set, given by a string;
    // The string &quot;back&quot; sets the current URL to the last set URL
    //After each instruction, the program should print the current URL. If the back
    //instruction can&#39;t be executed, print
    //&quot;no previous URLs&quot;.
    //The input ends with the Home; command, and then you simply have to stop the
    //program.
    // Use ArrayDeque&lt;&gt;.
    // Use String to keep the current page.
    // Use push(), when moving to the next page.
    // Use pop(), when going back.
    //Input Output
    //https://www.google.com/
    //back
    //https://www.google.com/search?q=d
    //eveloper+path
    //https://roadmap.sh/
    //
    //https://www.google.com/
    //no previous URLs
    //https://www.google.com/search?q=d
    //eveloper+path
    //https://roadmap.sh/

    //https://www.google.com/
    //https://www.google.com/search?q=sirma
    //back
    //back
    //https://www.google.com/search?q=java
    //back
    //Home
    // Outputs:
    //https://www.google.com/
    //https://www.google.com/search?q=sirma
    //https://www.google.com/
    //no previous URLs
    //https://www.google.com/search?q=java
    //https://www.google.com/
    public static void main(String[] args) {
        String input="https://www.google.com/\n" +
                "back\n" +
                "https://www.google.com/search?q=developer+path\n" +
                "https://roadmap.sh/\n"+
                "https://roadmap.sh/backend\n" +
                "back\n" +
                "Home";
        String []arrInput=input.split("\n");
        ArrayDeque<String>arrayDeque=new ArrayDeque<>();
        ArrayDeque<String>backArrayDeque=new ArrayDeque<>();
        String currentUrl=arrInput[0];
        for (int i = 0; i < arrInput.length; i++) {
            if(arrInput[i].equals("Home")){
                break;
            }else {
                if(arrInput[i].equals("back")){
                    if(arrayDeque.size()==1) {
                        System.out.println("no previous URLs");
                        continue;
                    }else {
                        String temp = arrayDeque.pop();
                        backArrayDeque.push(temp);
                        if(!arrayDeque.isEmpty()) {
                            currentUrl = arrayDeque.peek();
                        }
                    }
                }else {
                        arrayDeque.push(arrInput[i]);
                        currentUrl=arrInput[i];
                }
            }
            System.out.println(currentUrl);
        }
    }
}
