import java.util.ArrayList;

public class Question_5_a {

    public static void main(String[] args) {
        String s = "Hello World";

        ArrayList<Character> charList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }

        if(charList.size()>3) {
            charList.set(3,'z');
        } else {
            System.out.println("The character at index 3 is not available");
        }

        for (int i = 0; i < charList.size(); i++) {
            System.out.print(charList.get(i));
        }

    }
}
